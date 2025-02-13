#include <Windows.h>
#include <tchar.h>
#include "console.hpp"
#include "cpp_tstring.hpp"
#include <algorithm>
#include <ranges>

_console::_console() {
	this->output = GetStdHandle(STD_OUTPUT_HANDLE);
	this->input = GetStdHandle(STD_INPUT_HANDLE);
	this->error = GetStdHandle(STD_ERROR_HANDLE);
	
	if (!SetConsoleCP(CP_UTF8)) abort();
	if (!SetConsoleOutputCP(CP_UTF8)) abort();
}

void _console::writeOutput(const TCHAR str[]) {
	WriteConsole(this->output, str, lstrlen(str), NULL, NULL);
}
void _console::writeOutput(const tstring&& str) {
	writeOutput(str.c_str());
}
void _console::writeOutput(const tstring str) {
	writeOutput(str.c_str());
}

void _console::writeError(const TCHAR str[]) {
	WriteConsole(this->error, str, lstrlen(str), NULL, NULL);
}
void _console::writeError(const tstring&& str) {
	writeError(str.c_str());
}
void _console::writeError(const tstring str) {
	writeError(str.c_str());
}

DWORD _console::readFixedSizeInput(TCHAR* str, const DWORD size, const PCONSOLE_READCONSOLE_CONTROL const pReadConsoleControl) {
	std::ranges::for_each(std::views::iota(static_cast<DWORD>(0), size), [&](std::size_t i) {
		str[i] = 0;
	});
	DWORD length;
	if (!ReadConsole(this->input, str, size, &length, pReadConsoleControl)) abort();
	return length;
}

tstring _console::readInput() {
	tstring input;
	TCHAR currChar = TEXT('\0');
	DWORD temp = 0;
	while (currChar != TEXT('\n')) {
		if (!ReadConsole(this->input, &currChar, 1, &temp, NULL)) abort();
		input.push_back(currChar);
	}
	input.pop_back();
	return input;
}

_console console = {};