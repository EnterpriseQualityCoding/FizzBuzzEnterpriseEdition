#include <Windows.h>
#include <tchar.h>
#include "cpp_tstring.hpp"

extern TCHAR helpMessage[];

interface IArgumentParserGetters {
	virtual bool shouldShowHelp() = 0;
	virtual bool isExplicitHelp() = 0;
	virtual tstring getOutputFilename() = 0;
	virtual tstring getCacheFile() = 0;
	virtual tstring getInputFile() = 0;
	virtual bool isInputSourceSpecified() = 0;
	virtual bool shouldShowSplash() = 0;
	virtual bool shouldUseTestInput() = 0;
};

interface IArgumentParserBigGetter {
	virtual bool getBooleanFlag(tstring flag) = 0;
	virtual tstring getStringArgument(tstring argument) = 0;
};

class ArgumentParser: public IArgumentParserGetters, public IArgumentParserBigGetter {
	bool showHelp = false;
	bool explicitHelp = false;
	tstring outputFilename = TEXT("");
	tstring cacheFile = TEXT("");
	tstring inputFile = TEXT("");
	bool inputSourceSpecified = false;
	bool noSplash = false;
	bool useTestInput = false;

public:
	void parse(const unsigned int argc, const TCHAR* const argv[]);

	virtual bool shouldShowHelp();
	virtual bool isExplicitHelp();
	virtual tstring getOutputFilename();
	virtual tstring getCacheFile();
	virtual tstring getInputFile();
	virtual bool isInputSourceSpecified();
	virtual bool shouldShowSplash();
	virtual bool shouldUseTestInput();

	virtual bool getBooleanFlag(tstring flag);
	virtual tstring getStringArgument(tstring argument);
};
