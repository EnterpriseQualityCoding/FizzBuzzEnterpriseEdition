package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;

/**
 * LoopRunner
 */
public final class LoopRunner {

	private final LoopContextStateManipulation myStateManipulation;
	private final LoopContextStateRetrieval myStateRetrieval;
	private final LoopPayloadExecution myPayload;

	/**
	 * @param stateManipulation LoopContextStateManipulation
	 * @param stateRetrieval LoopContextStateRetrieval
	 * @param payload LoopPayloadExecution
	 */
	public LoopRunner(final LoopContextStateManipulation stateManipulation,
			final LoopContextStateRetrieval stateRetrieval, final LoopPayloadExecution payload) {
		super();
		this.myStateManipulation = stateManipulation;
		this.myStateRetrieval = stateRetrieval;
		this.myPayload = payload;
	}

	/**
	 * @return
	 */
	public void runLoop() {
		for (this.myStateManipulation.start(); this.myStateManipulation.shouldProceed(); this.myStateManipulation.proceed()) {
			this.myPayload.runLoopPayload(this.myStateRetrieval);
		}
	}

}
