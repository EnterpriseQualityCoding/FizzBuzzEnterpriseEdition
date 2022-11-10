// LoopCondition.java
// LoopCondition

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

// imports org.springframework.stereotype.Service
import org.springframework.stereotype.Service;

// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator
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
		// create a constant called `comparisonResult` with the type of `ThreeWayIntegerComparisonResult` which has the value of the returned value of the method `Compare` from the class `ThreeWayIntegerCompare` and gets passed the constant parameter argument value of `nCurrentNumber` of type int and the constant parameter argument value of `nTotalCount` of type int
		final ThreeWayIntegerComparisonResult comparisonResult = ThreeWayIntegerComparator.Compare(nCurrentNumber,
				nTotalCount);
		// check if the value `FirstIsLessThanSecond` is equal to the constant `comparisonResult` of type `ThreeWayIntegerComparisonResult`
		// if it is, return true
		// otherwise, check if the value `FirstEqualsSecond` is equal to the constant `comparisonResult` of type `ThreeWayIntegerComparisonResult`
		// if it is, return true
		// otherwise, return false
		if (ThreeWayIntegerComparisonResult.FirstIsLessThanSecond == comparisonResult) {
			return true;
		} else if (ThreeWayIntegerComparisonResult.FirstEqualsSecond == comparisonResult) {
			return true;
		} else {
			return false;
		}
	}

}
