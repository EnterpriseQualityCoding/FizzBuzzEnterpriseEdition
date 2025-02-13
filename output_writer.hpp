#pragma once
#include "cpp_tstring.hpp"
#include "fizz_buzz.hpp"
#include <vector>

struct BaseOutputWriter {
	virtual ~BaseOutputWriter() {};
	virtual void _write(tstring str) = 0;
	void writeOne(unsigned long long int number, FizzBuzzResult result);
	void writeMany(std::vector<std::pair<unsigned long long int, FizzBuzzResult>> values);
};

struct ConsoleOutputWriter : BaseOutputWriter {
	virtual void _write(tstring str);
};

struct FileOutputWriter : BaseOutputWriter {
	HANDLE hFile;

	FileOutputWriter(tstring file);

	virtual void _write(tstring str);
	~FileOutputWriter();
};