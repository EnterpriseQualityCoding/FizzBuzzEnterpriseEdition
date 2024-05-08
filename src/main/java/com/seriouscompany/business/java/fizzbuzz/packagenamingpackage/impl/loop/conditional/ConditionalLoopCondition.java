package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopCondition;

/**
 * Conditional LoopCondition
 */
@Service
public class ConditionalLoopCondition implements LoopCondition {

	/**
	 * @param loopState LoopState
	 * @param conditionalLoopIsFinishedChecker ConditionalLoopIsFinishedChecker
	 * @return boolean
	 */
	public boolean evaluateLoop(final LoopState loopState, final ConditionalLoopIsFinishedChecker conditionalLoopIsFinishedChecker) {
		ConditionalLoopState myConditionalLoopState;
		if (loopState instanceof ConditionalLoopState) {
			myConditionalLoopState = (ConditionalLoopState) loopState;
		} else {
			throw Constants.THE_WRONG_TYPE_OF_LOOP_STATE_WAS_PROVIDED.apply(Language.DEFAULT).createException();
		}
		boolean conditionalLoopIsFinished = conditionalLoopIsFinishedChecker.checkIfConditionalLoopIsFinished(loopState);
		if (conditionalLoopIsFinished == true) {
			return true;
		} else if (conditionalLoopIsFinished == false) {
			return false;
		} else {
			return Constants.COULD_NOT_DETERMINE_IF_THE_LOOP_WAS_FINISHED.apply(Language.DEFAULT).createException();
		}
	}

}
