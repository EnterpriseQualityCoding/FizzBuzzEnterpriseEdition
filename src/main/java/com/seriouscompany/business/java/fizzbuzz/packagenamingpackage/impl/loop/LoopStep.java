package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

@Service
public class LoopStep {

	private static final int LOOP_INC_VALUE = 1;

	public int stepLoop(final int nCurrentNumber) {
		return nCurrentNumber + LoopStep.LOOP_INC_VALUE;
	}

}
