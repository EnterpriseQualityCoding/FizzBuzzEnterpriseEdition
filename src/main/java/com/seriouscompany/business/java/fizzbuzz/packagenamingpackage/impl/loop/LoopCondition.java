package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;

public class LoopCondition {
	public boolean evaluateLoop(int nCurrentNumber, int nTotalCount) {
		final ThreeWayIntegerComparisonResult comparisonResult = ThreeWayIntegerComparator.Compare(nCurrentNumber, nTotalCount);
		return comparisonResult == ThreeWayIntegerComparisonResult.FirstIsLessThanSecond || comparisonResult == ThreeWayIntegerComparisonResult.FirstEqualsSecond;
	}
}
