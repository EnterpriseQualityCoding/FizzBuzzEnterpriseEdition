package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;

@Service
public class LoopCondition {

	public boolean evaluateLoop(final int nCurrentNumber, final int nTotalCount) {
		final ThreeWayIntegerComparisonResult comparisonResult = ThreeWayIntegerComparator.compare(nCurrentNumber,
				nTotalCount);
		if (comparisonResult == ThreeWayIntegerComparisonResult.FirstIsLessThanSecond) {
			return true;
		}
		return comparisonResult == ThreeWayIntegerComparisonResult.FirstEqualsSecond;
	}
}
