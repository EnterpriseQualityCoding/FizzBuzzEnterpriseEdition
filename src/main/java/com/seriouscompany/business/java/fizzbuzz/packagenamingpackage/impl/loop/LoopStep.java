package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;

/**
 * LoopStep
 */
@Service
public class LoopStep {

	/**
	 * @param nCurrentNumber int
	 * @return int
	 */
	public int stepLoop(final int nCurrentNumber) {
		return nCurrentNumber + Constants.LOOP_INC_VALUE;
	}

}
