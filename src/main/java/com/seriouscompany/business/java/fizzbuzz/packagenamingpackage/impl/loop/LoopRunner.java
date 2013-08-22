package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;

public class LoopRunner {

	private LoopContextStateManipulation myStateManipulation;
	private LoopContextStateRetrieval myStateRetrieval;
	private LoopPayloadExecution myPayload;

	public LoopRunner(LoopContextStateManipulation stateManipulation,
						LoopContextStateRetrieval stateRetrieval,
						LoopPayloadExecution payload)
	{
		myStateManipulation = stateManipulation;
		myStateRetrieval = stateRetrieval;
		myPayload = payload;
	}

	public void runLoop() {
		for (myStateManipulation.start(); myStateManipulation.shouldProceed(); myStateManipulation.proceed()) {
			myPayload.runLoopPayload(myStateRetrieval);
		}
	}

}
