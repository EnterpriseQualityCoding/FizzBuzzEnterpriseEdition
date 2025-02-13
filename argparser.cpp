#include <Windows.h>
#include <tchar.h>
#include "cpp_tstring.hpp"
#include <iterator>
#include <vector>
#include "argparser.hpp"

static constexpr TCHAR helpMessage[] = TEXT("Usage: [program] [--output file] [--enable_cache cache_file] [--source source]\n\
\t--no-splash - Don't show the FizzBuzz Enterprise Edition splash message.\n\
\t--help - Display this help message, even if the input source is configured properly.\n\
\t--output [file] - Specify the file to write the result to. If this argument is omitted, the result is written into the standard output\n\
\t--enable_cache [cache_file] - Enable persistent caching.\n\
\t--input_source [source] - Specify where to read the numbers from. If you don't specify this argument, the help message will be displayed instead. [source] can be one of:\n\
\t\tstdinput - The program's standard input. It's recommended to disable the splash if you use this option when calling FizzBuzz Enterprise Edition from an another program.\n\
\t\tfile filename.txt - A file. If you set the source to file, you need to specify the filename right after the source argument.\n\
\t\ttestinput - A fake input source. It inputs all numbers from 1 to 100 (both sides included).\n");

// See the help message above for more info about these flags.
static constexpr TCHAR HELP_FLAG[] = TEXT("--help");
static constexpr TCHAR OUTPUT_FILENAME_FLAG[] = TEXT("--output");
static constexpr TCHAR ENABLE_CACHE_FLAG[] = TEXT("--enable_cache");
static constexpr TCHAR INPUT_SOURCE_FLAG[] = TEXT("--input_source");
static constexpr TCHAR INPUT_SOURCE_STDINPUT[] = TEXT("stdinput");
static constexpr TCHAR INPUT_SOURCE_FILE[] = TEXT("file");
static constexpr TCHAR INPUT_SOURCE_TESTINPUT[] = TEXT("testinput");
static constexpr TCHAR NO_SPLASH_FLAG[] = TEXT("--no-splash");

void ArgumentParser::parse(const unsigned int argc, const TCHAR* const argv[]) {
	std::vector argvVector(argv, argv + argc);
	auto it = argvVector.begin();
	while (it < argvVector.end()) {
		if (lstrcmp(*it, HELP_FLAG) == 0) {
			showHelp = true;
			explicitHelp = true;
		}
		else if (lstrcmp(*it, OUTPUT_FILENAME_FLAG) == 0) {
			std::advance(it, 1);
			if (it >= argvVector.end()) {
				showHelp = true;
				break;
			}
			this->outputFilename = *it;
			if (this->outputFilename == TEXT("")) {
				showHelp = true;
				break;
			}
		}
		else if (lstrcmp(*it, ENABLE_CACHE_FLAG) == 0) {
			std::advance(it, 1);
			if (it >= argvVector.end()) {
				showHelp = true;
				break;
			}
			this->cacheFile = *it;
			if (this->cacheFile == TEXT("")) {
				showHelp = true;
				break;
			}
		}
		else if (lstrcmp(*it, INPUT_SOURCE_FLAG) == 0) {
			inputSourceSpecified = true;
			std::advance(it, 1);
			if (it >= argvVector.end()) {
				showHelp = true;
				break;
			}
			if (lstrcmp(*it, INPUT_SOURCE_STDINPUT) == 0) {
				this->inputFile = TEXT("");
			}
			else if (lstrcmp(*it, INPUT_SOURCE_FILE) == 0) {
				std::advance(it, 1);
				if (it >= argvVector.end()) {
					showHelp = true;
					break;
				}
				this->inputFile = *it;
				if (this->inputFile == TEXT("")) {
					showHelp = true;
					break;
				}
			}
			else if (lstrcmp(*it, INPUT_SOURCE_TESTINPUT) == 0) {
				this->useTestInput = true;
			}
			else {
				showHelp = true;
				break;
			}
		}
		else if (lstrcmp(*it, NO_SPLASH_FLAG) == 0) {
			this->noSplash = true;
		}
		std::advance(it, 1);
	}
	if (!inputSourceSpecified) showHelp = true;
}
bool ArgumentParser::shouldShowHelp() {
	return this->showHelp;
}
bool ArgumentParser::isExplicitHelp() {
	return this->explicitHelp;
}
tstring ArgumentParser::getOutputFilename() {
	return this->outputFilename;
}
tstring ArgumentParser::getCacheFile() {
	return this->cacheFile;
}
tstring ArgumentParser::getInputFile() {
	return this->inputFile;
}
bool ArgumentParser::isInputSourceSpecified() {
	return this->inputSourceSpecified;
}
bool ArgumentParser::shouldShowSplash() {
	return !this->noSplash;
}
bool ArgumentParser::shouldUseTestInput() {
	return this->useTestInput;
}

bool ArgumentParser::getBooleanFlag(tstring flag) {
	if (flag == TEXT("showHelp")) return this->shouldShowHelp();
	if (flag == TEXT("inputSourceSpecified")) return this->isInputSourceSpecified();
	if (flag == TEXT("noSplash")) return !this->shouldShowSplash();
	if (flag == TEXT("useTestInput")) return this->shouldUseTestInput();
	abort();
}

tstring ArgumentParser::getStringArgument(tstring argument) {
	if (argument == TEXT("outputFilename")) return this->getOutputFilename();
	if (argument == TEXT("cacheFile")) return this->getCacheFile();
	if (argument == TEXT("inputFile")) return this->getInputFile();
	abort();
}
