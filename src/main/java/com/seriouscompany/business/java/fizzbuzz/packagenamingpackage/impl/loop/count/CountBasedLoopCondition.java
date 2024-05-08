package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopCondition;
import java.util.function.IntSupplier;

/**
 * Count-based LoopCondition
 */
@Service
public class CountBasedLoopCondition {

	/**
	 * @param nCurrentNumber int
	 * @param nTotalCount int
	 * @return boolean
	 */
	public boolean evaluateLoop(final LoopState loopState, final IntSupplier nCurrentNumber, final IntSupplier nTotalCount) {
		final ThreeWayIntegerComparisonResult comparisonResult = ThreeWayIntegerComparator.Compare(nCurrentNumber.get(),
				nTotalCount.get());
		if (ThreeWayIntegerComparisonResult.FirstIsLessThanSecond == comparisonResult) {
			return true;
		} else if (ThreeWayIntegerComparisonResult.FirstEqualsSecond == comparisonResult) {
			return true;
		} else {
			return false;
		}
	}

}
