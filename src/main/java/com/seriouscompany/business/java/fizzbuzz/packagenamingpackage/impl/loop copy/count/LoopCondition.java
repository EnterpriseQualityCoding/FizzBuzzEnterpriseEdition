package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;

/**
 * LoopCondition
 */
@Service
public class LoopCondition {

	/**
	 * @param nCurrentNumber int
	 * @param nTotalCount int
	 * @return boolean
	 */
	public boolean evaluateLoop(final int nCurrentNumber, final int nTotalCount) {
		final ThreeWayIntegerComparisonResult comparisonResult = ThreeWayIntegerComparator.Compare(nCurrentNumber,
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
