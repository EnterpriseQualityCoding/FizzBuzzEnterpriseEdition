#pragma once

#include <Windows.h>
#include <unordered_map>
#include "fizz_buzz.hpp"
#include "cpp_tstring.hpp"
#include "console.hpp"
#include <algorithm>
#include <cstdint>

struct FizzBuzzCacheLoader {
	HANDLE hFile;

	FizzBuzzCacheLoader(tstring file);

	void loadCache(std::unordered_map<unsigned long long int, FizzBuzzResult>& cache);

	void dumpCache(std::unordered_map<unsigned long long int, FizzBuzzResult>& cache);

	~FizzBuzzCacheLoader();
};