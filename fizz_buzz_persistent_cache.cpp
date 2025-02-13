#include "fizz_buzz_persistent_cache.hpp"
#include <Windows.h>
#include <unordered_map>
#include "fizz_buzz.hpp"
#include "cpp_tstring.hpp"
#include "console.hpp"
#include <sstream>
#include <algorithm>
#include <cstdint>

FizzBuzzCacheLoader::FizzBuzzCacheLoader(tstring file) {
	this->hFile = CreateFile(file.c_str(), GENERIC_READ | GENERIC_WRITE, FILE_SHARE_READ, NULL, OPEN_ALWAYS, FILE_ATTRIBUTE_NORMAL, NULL);
	if (GetLastError() != NO_ERROR && GetLastError() != ERROR_ALREADY_EXISTS) {
		DWORD error = GetLastError();
		TCHAR* arr;
		if (!FormatMessage(FORMAT_MESSAGE_ALLOCATE_BUFFER | FORMAT_MESSAGE_FROM_SYSTEM, NULL, error, LANG_USER_DEFAULT, reinterpret_cast<LPTSTR>(&arr), 1, NULL)) abort();
		console.writeError(TEXT("Failed to open the persistent cache file for reading and writing: "));
		console.writeError(arr);
		console.writeError(TEXT("\n"));
		abort();
	}
}

void FizzBuzzCacheLoader::loadCache(std::unordered_map<unsigned long long int, FizzBuzzResult>& cache) {
	cache.clear();
	unsigned long long int expectedSize;
	GetFileSizeEx(this->hFile, (PLARGE_INTEGER)&expectedSize);
	if (expectedSize > ((size_t)-1)) abort(); // (not possible under normal circumstances)
	char* dataStoredInTheFile = new char[expectedSize + 1];
	ZeroMemory(dataStoredInTheFile, sizeof(char) * (expectedSize + 1));
	DWORD actualSize = 0;
	if (!ReadFile(this->hFile, dataStoredInTheFile, expectedSize, &actualSize, NULL)) abort();
	if (actualSize != expectedSize) abort();
	std::string str(dataStoredInTheFile);
	std::istringstream stream(str);
	std::string line;
	while (std::getline(stream, line, '\n')) {
		if (line[line.size() - 1] == '\r') line.pop_back();
		if (line.size() == 0) continue;
		std::string number, result;
		number = line.substr(0, line.find_first_of(':'));
		result = line.substr(line.find_first_of(':') + 1);
		unsigned long long int actualNumber = strtoull(number.c_str(), nullptr, 10);
		FizzBuzzResult actualResult = static_cast<FizzBuzzResult>(strtoull(result.c_str(), nullptr, 10));
		cache[actualNumber] = actualResult;
	}
}

void FizzBuzzCacheLoader::dumpCache(std::unordered_map<unsigned long long int, FizzBuzzResult>& cache)  {
	SetFilePointer(this->hFile, NULL, NULL, FILE_BEGIN);
	SetEndOfFile(this->hFile);
	std::for_each(cache.begin(), cache.end(), [&](const std::unordered_map<unsigned long long int, FizzBuzzResult>::value_type& data) {
		std::string line;
		std::string temp;

		unsigned long long int n = data.first;
		while (n != 0) {
			line.push_back((n % 10) + '0');
			n /= 10;
		}
		std::reverse(line.begin(), line.end());
		line.push_back(':');

		uint8_t value = static_cast<uint8_t>(data.second);
		while (value != 0) {
			temp.push_back((value % 10) + '0');
			value /= 10;
		}
		std::reverse(temp.begin(), temp.end());
		line.append(temp);
		line.push_back('\n');
		DWORD dataWritten = 0;
		WriteFile(this->hFile, line.c_str(), line.size(), &dataWritten, NULL);
		if (dataWritten != line.size()) abort();
		SetFilePointer(this->hFile, NULL, NULL, FILE_END);
	});
}

FizzBuzzCacheLoader::~FizzBuzzCacheLoader() {
	CloseHandle(this->hFile);
}