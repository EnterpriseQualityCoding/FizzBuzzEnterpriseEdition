package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;
import org.springframework.stereotype.Service;

@Service
public class LoopCondition {

	public static boolean evaluateLoop(final int nCurrentNumber, final int nTotalCount) {
		final ThreeWayIntegerComparisonResult comparisonResult = ThreeWayIntegerComparator.compare(nCurrentNumber,
				nTotalCount);
		if (ThreeWayIntegerComparisonResult.FirstIsLessThanSecond == comparisonResult) {
			return true;
		} else if (ThreeWayIntegerComparisonResult.FirstEqualsSecond == comparisonResult) {
			return true;
		} else {
			return false;
		}
	}

}
