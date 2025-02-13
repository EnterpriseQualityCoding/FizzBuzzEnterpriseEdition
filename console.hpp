#pragma once

#include <Windows.h>
#include <tchar.h>
#include "cpp_tstring.hpp"

struct _console {
	HANDLE output;
	HANDLE input;
	HANDLE error;

	_console();

	void writeOutput(const TCHAR str[]);
	void writeOutput(const tstring&& str);
	void writeOutput(const tstring str);

	void writeError(const TCHAR str[]);
	void writeError(const tstring&& str);
	void writeError(const tstring str);

	DWORD readFixedSizeInput(TCHAR* str, const DWORD size, const PCONSOLE_READCONSOLE_CONTROL const pReadConsoleControl = NULL);

	tstring readInput();
};

extern _console console;