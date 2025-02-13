#include "fizz_buzz.hpp"

FizzBuzzResult _FizzBuzzer::fizzBuzz(const unsigned long long int number) {
	FizzBuzzResult cacheLookupResult = this->cache[number]; // Performance of an std::unordered_map lookup: O(1)
	if (cacheLookupResult != FizzBuzzResult::UNKNOWN) return cacheLookupResult;
	// Performance of an actual calculation:
	FizzBuzzResult calculatedResult = FizzBuzzResult::NONE;
	if (number % 15 == 0) { // O(1)
		calculatedResult = FizzBuzzResult::FIZZBUZZ;
	}
	else if (number % 5 == 0) { // O(1)
		calculatedResult = FizzBuzzResult::BUZZ;
	}
	else if (number % 3 == 0) { // O(1)
		calculatedResult = FizzBuzzResult::FIZZ;
	}
	this->cache[number] = calculatedResult;
	return calculatedResult;
}

FizzBuzzResult operator|(FizzBuzzResult lhs, FizzBuzzResult rhs) {
	return static_cast<FizzBuzzResult>(
		static_cast<std::underlying_type<FizzBuzzResult>::type>(lhs) |
		static_cast<std::underlying_type<FizzBuzzResult>::type>(rhs)
		);
}

FizzBuzzResult operator&(FizzBuzzResult lhs, FizzBuzzResult rhs) {
	return static_cast<FizzBuzzResult>(
		static_cast<std::underlying_type<FizzBuzzResult>::type>(lhs) &
		static_cast<std::underlying_type<FizzBuzzResult>::type>(rhs)
		);
}

tostringstream& operator<<(tostringstream& ostream, FizzBuzzResult const& fizzBuzzResult) {
	if ((fizzBuzzResult & FizzBuzzResult::FIZZ) != FizzBuzzResult::UNKNOWN) ostream << TEXT("Fizz");
	if ((fizzBuzzResult & FizzBuzzResult::BUZZ) != FizzBuzzResult::UNKNOWN) ostream << TEXT("Buzz");
	return ostream;
}