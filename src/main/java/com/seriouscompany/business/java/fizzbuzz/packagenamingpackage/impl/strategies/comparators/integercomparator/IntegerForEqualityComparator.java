package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator;

import org.springframework.stereotype.Service;

@Service
public final class IntegerForEqualityComparator {

	private IntegerForEqualityComparator() {}

	public static boolean areTwoIntegersEqual(final int nFirstInteger, final int nSecondInteger) {
		final ThreeWayIntegerComparisonResult comparisonResult =
				ThreeWayIntegerComparator.Compare(nFirstInteger, nSecondInteger);
		if (ThreeWayIntegerComparisonResult.FirstEqualsSecond == comparisonResult) {
			return true;
		} else {
			return false;
		}
	}

}
