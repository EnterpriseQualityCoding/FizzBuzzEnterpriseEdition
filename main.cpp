#include <Windows.h>
#include <tchar.h>
#include "console.hpp"
#include "argparser.hpp"
#include "output_writer.hpp"
#include "input_reader.hpp"
#include "fizz_buzz_persistent_cache.hpp"

// Welcome to 2024, where open source projects have a copyright.
TCHAR copyrightMessage[] = {
	TEXT("FizzBuzz Enterprise Edition.\nEnterpriseQualityCoding - the most serious and not satire or fake company in the universe.\n")
};

ArgumentParser argParser;
BaseInputReader* inputReader;
BaseOutputWriter* outputWriter;
FizzBuzzCacheLoader* cacheLoader;

int _tmain(unsigned int argc, TCHAR* argv[]) {
	argParser.parse(argc, argv);
	if (argParser.shouldShowSplash()) console.writeOutput(copyrightMessage);
	if (argParser.shouldShowHelp()) {
		console.writeOutput(helpMessage);
		return (argParser.isExplicitHelp()) ? 0 : -1;
	}
	if (argParser.shouldUseTestInput()) {
		inputReader = new TestInputReader();
	}
	else if (argParser.getInputFile() == TEXT("")) {
		inputReader = new ConsoleInputReader();
	}
	else {
		inputReader = new FileInputReader(argParser.getInputFile());
	}
	if (argParser.getOutputFilename() != TEXT("")) {
		outputWriter = new FileOutputWriter(argParser.getOutputFilename());
	}
	else {
		outputWriter = new ConsoleOutputWriter();
	}

	if (argParser.getCacheFile() != TEXT("")) {
		cacheLoader = new FizzBuzzCacheLoader(argParser.getCacheFile());
		cacheLoader->loadCache(fizzbuzzer.cache);
	}

	while (!inputReader->getIsInputExhausted()) {
		try {
			unsigned long long int value = inputReader->read();
			outputWriter->writeOne(value, fizzbuzzer.fizzBuzz(value));
		}
		catch (std::exception e) { // Just in case something goes wrong (is the input stream empty?).
			continue;
		}
	}

	if (argParser.getCacheFile() != TEXT("")) {
		cacheLoader->dumpCache(fizzbuzzer.cache);
	}

	delete cacheLoader;
	delete outputWriter;
	delete inputReader;
	return 0;
}
