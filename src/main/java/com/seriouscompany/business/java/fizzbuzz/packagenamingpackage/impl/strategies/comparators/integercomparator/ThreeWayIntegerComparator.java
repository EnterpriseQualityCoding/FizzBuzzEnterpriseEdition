package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator;

public class ThreeWayIntegerComparator {
	public static ThreeWayIntegerComparisonResult Compare(int nFirstInteger, int nSecondInteger) {
		if (nFirstInteger == nSecondInteger) {
			return ThreeWayIntegerComparisonResult.FirstEqualsSecond;
		} else if (nFirstInteger < nSecondInteger) {
			return ThreeWayIntegerComparisonResult.FirstIsLessThanSecond;
		} else if (nFirstInteger > nSecondInteger) {
			return ThreeWayIntegerComparisonResult.FirstIsGreaterThanSecond;
		} else {
			// If the integers cannot be compared, then something is seriously wrong with the numbers.
			throw new UnsupportedOperationException("The integers could not be compared.");
		}
	}
}
