package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator;

public class ThreeWayIntegerComparator {
	public static ThreeWayIntegerComparisonResult Compare(int f, int s) {
		if (f == s) {
			return ThreeWayIntegerComparisonResult.FirstEqualsSecond;
		} else if (f < s) {
			return ThreeWayIntegerComparisonResult.FirstIsLessThanSecond;
		} else {
			return ThreeWayIntegerComparisonResult.FirstIsGreaterThanSecond;
		}
	}
}
