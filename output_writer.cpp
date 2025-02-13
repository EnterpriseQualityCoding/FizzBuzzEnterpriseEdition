#include "output_writer.hpp"
#include "cpp_tstring.hpp"
#include "fizz_buzz.hpp"
#include <vector>
#include <algorithm>
#include "console.hpp"
#include <tchar.h>
#include <algorithm>
#include "cpp_tstring.hpp"

void BaseOutputWriter::writeOne(unsigned long long int number, FizzBuzzResult result) {
	tostringstream str;
	if (number == 0) str << TEXT("0");
	else while (number != 0) {
		str << (TCHAR)((number % 10) + TEXT('0'));
		number /= 10;
	}
	tstring _result = str.str();
	std::reverse(_result.begin(), _result.end());
	str.clear();
	str.str(TEXT(""));
	str << _result << TEXT(":");
	if ((result & FizzBuzzResult::NONE) != FizzBuzzResult::UNKNOWN) str << _result;
	else str << result;
	str << TEXT('\n');
	_write(str.str());
}

void BaseOutputWriter::writeMany(std::vector<std::pair<unsigned long long int, FizzBuzzResult>> values) {
	std::for_each(values.begin(), values.end(), [&](std::pair<unsigned long long int, FizzBuzzResult>& pair) {
		writeOne(pair.first, pair.second);
	});
}

void ConsoleOutputWriter::_write(tstring str) {
	console.writeOutput(str);
}

FileOutputWriter::FileOutputWriter(tstring file) {
	this->hFile = CreateFile(file.c_str(), FILE_APPEND_DATA, NULL, NULL, CREATE_ALWAYS, FILE_ATTRIBUTE_NORMAL, NULL);
	if (GetLastError() != NO_ERROR && GetLastError() != ERROR_ALREADY_EXISTS) {
		DWORD error = GetLastError();
		TCHAR* arr;
		if (!FormatMessage(FORMAT_MESSAGE_ALLOCATE_BUFFER | FORMAT_MESSAGE_FROM_SYSTEM, NULL, error, LANG_USER_DEFAULT, reinterpret_cast<LPTSTR>(&arr), 1, NULL)) abort();
		console.writeError(TEXT("Failed to open the output file for writing: "));
		console.writeError(arr);
		console.writeError(TEXT("\n"));
		abort();
	}
}

void FileOutputWriter::_write(tstring str) {
	DWORD dataWritten;
	SetFilePointer(hFile, 0, NULL, FILE_END);
	const TCHAR* c_str = str.c_str();
	WriteFile(this->hFile, c_str, str.length() * sizeof(TCHAR), &dataWritten, NULL);
	if (dataWritten != str.length() * sizeof(TCHAR)) abort();
}

FileOutputWriter::~FileOutputWriter() {
	CloseHandle(this->hFile);
}