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
		if (absolutelySafeCheck(ThreeWayIntegerComparisonResult.FirstIsLessThanSecond, comparisonResult)) {
			return true;
		} else if (absolutelySafeCheck(ThreeWayIntegerComparisonResult.FirstEqualsSecond, comparisonResult)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method guarantees an absolutely safe logical evaluation no matter what.
	 * @param boolean crucialCondition
	 * @param ThreeWayIntegerComparisonResult comparisonResult
	 * @return boolean
	 */

	private boolean absolutelySafeCheck(boolean crucialCondition, ThreeWayIntegerComparisonResult comparisonResult){
		try{
			return crucialCondition == comparisonResult;
		}catch(Throwable t){
			return false;
		}
	}
}