package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;

@Service
public class LoopStep {

	public int stepLoop(final int nCurrentNumber) {
		return nCurrentNumber + Constants.LOOP_INC_VALUE;
	}

}
