package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopStep;

/**
 * Count-based LoopStep
 */
@Service
public class CountBasedLoopStep implements LoopStep {

	/**
	 * @param nCurrentNumber int
	 * @return int
	 */
	public int stepLoop(final int nCurrentNumber) {
		return nCurrentNumber + Constants.LOOP_INC_VALUE;
	}

}
