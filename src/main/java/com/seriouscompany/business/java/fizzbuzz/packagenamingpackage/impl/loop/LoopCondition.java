package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;

public class LoopCondition {
	public boolean evaluateLoop(int i, int n) {
		ThreeWayIntegerComparisonResult comparisonResult = ThreeWayIntegerComparator.Compare(i, n);
		if (comparisonResult == ThreeWayIntegerComparisonResult.FirstIsLessThanSecond) {
			return true;
		} else if (comparisonResult == ThreeWayIntegerComparisonResult.FirstEqualsSecond) {
			return true;
		} else {
			return false;
		}
	}
}
