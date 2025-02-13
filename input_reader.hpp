#pragma once

#include <Windows.h>
#include <tchar.h>
#include <vector>
#include "cpp_tstring.hpp"
#include "console.hpp"

struct BaseInputReader {
	bool inputExhausted = false;

	virtual bool getIsInputExhausted() {
		return this->inputExhausted;
	}
	virtual unsigned long long int read() = 0;
	virtual std::vector<unsigned long long int> readRemainingInput();
	virtual ~BaseInputReader() {};
};

struct FileInputReader : BaseInputReader {
	HANDLE hFile;

	FileInputReader(tstring file);

	virtual unsigned long long int read();
	virtual bool getIsInputExhausted();
	~FileInputReader();
};

struct ConsoleInputReader : BaseInputReader {
	virtual unsigned long long int read();
	virtual bool getIsInputExhausted();
};

struct TestInputReader : BaseInputReader {
	unsigned long long int i = 1;
	virtual unsigned long long int read();
	virtual bool getIsInputExhausted();
};