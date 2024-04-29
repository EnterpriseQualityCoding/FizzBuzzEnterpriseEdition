package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;

/**
 * Conditional LoopIsFinishedChecker
 */
@Service
public class ConditionalLoopIsFinishedChecker {
    private final Predicate<ConditionalLoopState> _loopFinishedCondition;
    public ConditionalLoopIsFinishedChecker(Predicate<ConditionalLoopState> loopFinishedCondition) {
        this._loopFinishedCondition = loopFinishedCondition;
    }

	/**
	 * @param conditionalLoopState ConditionalLoopState
	 * @return boolean
	 */
	public boolean checkIfConditionalLoopIsFinished(final ConditionalLoopState conditionalLoopState) {
		return this._loopFinishedCondition.test(conditionalLoopState);
	}

}