package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator;

import org.springframework.stereotype.Service;

@Service
public class IntegerForEqualityComparator {

	public static boolean areTwoIntegersEqual(final int nFirstInteger, final int nSecondInteger) {
		final ThreeWayIntegerComparisonResult comparisonResult =
				ThreeWayIntegerComparator.Compare(nFirstInteger, nSecondInteger);
		if (comparisonResult == ThreeWayIntegerComparisonResult.FirstEqualsSecond) {
			return true;
		} else {
			return false;
		}
	}
}
