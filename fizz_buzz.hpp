#pragma once

#include <cstdint>
#include <tchar.h>
#include <ostream>
#include <unordered_map>
#include "cpp_tstring.hpp"

enum class FizzBuzzResult : uint8_t {
	UNKNOWN = 0, NONE = 1 << 0, FIZZ = 1 << 1, BUZZ = 1 << 2, FIZZBUZZ = FIZZ | BUZZ
};

struct _FizzBuzzer {
	std::unordered_map<unsigned long long int, FizzBuzzResult> cache;
	FizzBuzzResult fizzBuzz(const unsigned long long int number);
};

inline _FizzBuzzer fizzbuzzer;

FizzBuzzResult operator|(FizzBuzzResult lhs, FizzBuzzResult rhs);
FizzBuzzResult operator&(FizzBuzzResult lhs, FizzBuzzResult rhs);
tostringstream& operator<<(tostringstream& ostream, FizzBuzzResult const& fizzBuzzResult);