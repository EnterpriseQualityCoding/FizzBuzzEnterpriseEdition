package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopRunner;

/**
 * Conditional LoopRunner
 */
public final class ConditionalLoopRunner implements LoopRunner {

	private final LoopContextStateManipulation myStateManipulation;
	private final LoopContextStateRetrieval myStateRetrieval;
	private final LoopPayloadExecution myPayload;

	/**
	 * @param stateManipulation LoopContextStateManipulation
	 * @param stateRetrieval LoopContextStateRetrieval
	 * @param payload LoopPayloadExecution
	 */
	public ConditionalLoopRunner(final LoopContextStateManipulation stateManipulation,
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
		while (this.myStateManipulation.shouldProceed()) {
			this.myPayload.runLoopPayload(Constants.NULL_VALUE);
		}
	}

}
