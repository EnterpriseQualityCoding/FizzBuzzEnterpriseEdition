#pragma once

#include <Windows.h>
#include <tchar.h>
#include <vector>
#include "cpp_tstring.hpp"
#include "console.hpp"
#include "input_reader.hpp"

std::vector<unsigned long long int> BaseInputReader::readRemainingInput() {
	std::vector<unsigned long long int> results;
	while (!this->inputExhausted) results.push_back(read());
	return results;
}

FileInputReader::FileInputReader(tstring file) {
	this->hFile = CreateFile(file.c_str(), GENERIC_READ, FILE_SHARE_READ, NULL, OPEN_EXISTING, FILE_ATTRIBUTE_NORMAL, NULL);
	if (GetLastError() != NO_ERROR) {
		DWORD error = GetLastError();
		TCHAR* arr;
		if (!FormatMessage(FORMAT_MESSAGE_ALLOCATE_BUFFER | FORMAT_MESSAGE_FROM_SYSTEM, NULL, error, LANG_USER_DEFAULT, reinterpret_cast<LPTSTR>(&arr), 1, NULL)) abort();
		console.writeError(TEXT("Failed to open the input file for reading: "));
		console.writeError(arr);
		console.writeError(TEXT("\n"));
		abort();
	}
	unsigned long long int fileSize;
	if (!GetFileSizeEx(this->hFile, (PLARGE_INTEGER) & fileSize)) {
		DWORD error = GetLastError();
		TCHAR* arr;
		if (!FormatMessage(FORMAT_MESSAGE_ALLOCATE_BUFFER | FORMAT_MESSAGE_FROM_SYSTEM, NULL, error, LANG_USER_DEFAULT, reinterpret_cast<LPTSTR>(&arr), 1, NULL)) abort();
		console.writeError(TEXT("Failed to get the input file size: "));
		console.writeError(arr);
		console.writeError(TEXT("\n"));
		abort();
	}
	if (fileSize == 0) inputExhausted = true;
}

unsigned long long int __input_reader_util_parse_ulonglong(BaseInputReader* _this, bool(*readChar)(TCHAR*, PDWORD)) {
	TCHAR currChar = '\0';
	DWORD temp = 0;
	unsigned long long int result = 0;
	if (!readChar(&currChar, &temp)) {
		if (GetLastError() != ERROR_HANDLE_EOF) abort();
		temp = 0;
	}
	if (temp == 0) {
		_this->inputExhausted = true;
		throw std::exception("There's nothing more in the input.");
	}
	bool isFirstChar = true;
	bool negative = false; // We need to read the rest of the number before throwing an exception to avoid leaving parts of a number in the buffer.
	do {
		// This seemingly uneccessary check is needed to fix a bug.
		if (currChar >= TEXT('0') && currChar <= TEXT('9')) {
			result *= 10;
			result += currChar - TEXT('0');
		}
		else if (isFirstChar && currChar == TEXT('-')) {
			negative = true;
		}
		if (!readChar(&currChar, &temp)) {
			if (GetLastError() != ERROR_HANDLE_EOF) abort();
			temp = 0;
		}
		if (temp == 0) {
			_this->inputExhausted = true;
			if (isFirstChar) throw std::exception("There's nothing more in the input.");
			break;
		}
		isFirstChar = false;
	} while (currChar >= TEXT('0') && currChar <= TEXT('9'));
	// Another bug fix - for CRLF line endings (\r\n), we need to skip the leftover newline.
	if (currChar == TEXT('\r')) ReadConsole(console.input, &currChar, 1, &temp, NULL);
	if (negative) throw std::exception("Negative numbers are not allowed."); // Why? Because.
	return result;
}

HANDLE __temp_hFile;

unsigned long long int FileInputReader::read() {
	if (inputExhausted) throw std::exception("There's nothing more in the input.");
	// I can't add a capture to the lambda, so instead I'm putting the handle in a global variable. It's not like we have more than one instance of this thing.
	__temp_hFile = this->hFile;
	return __input_reader_util_parse_ulonglong(this, [](PTCHAR pChar, PDWORD pTemp) -> bool {
		return ReadFile(__temp_hFile, pChar, 1, pTemp, NULL);
	});
}

unsigned long long int ConsoleInputReader::read() {
	if (inputExhausted) throw std::exception("There's nothing more in the input.");
	return __input_reader_util_parse_ulonglong(this, [](TCHAR* pChar, PDWORD _temp)->bool {
		return ReadConsole(console.input, pChar, 1, _temp, NULL);
	});
}

unsigned long long int TestInputReader::read() {
	if (inputExhausted) throw std::exception("There's nothing more in the input.");
	if (i == 100) inputExhausted = true;
	return i++;
}

bool TestInputReader::getIsInputExhausted() {
	return this->inputExhausted;
}
bool FileInputReader::getIsInputExhausted() {
	return this->inputExhausted;
}
bool ConsoleInputReader::getIsInputExhausted() {
	return this->inputExhausted;
}

FileInputReader::~FileInputReader() {
	CloseHandle(this->hFile);
}
