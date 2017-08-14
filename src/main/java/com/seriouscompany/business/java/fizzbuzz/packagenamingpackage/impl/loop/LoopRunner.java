package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;

public final class LoopRunner {

	private final LoopContextStateManipulation myStateManipulation;
	private final LoopContextStateRetrieval myStateRetrieval;
	private final LoopPayloadExecution myPayload;

	public LoopRunner(final LoopContextStateManipulation stateManipulation,
			final LoopContextStateRetrieval stateRetrieval, final LoopPayloadExecution payload) {
		super();
		this.myStateManipulation = stateManipulation;
		this.myStateRetrieval = stateRetrieval;
		this.myPayload = payload;
	}

	public void runLoop() {
		this.myStateManipulation.start();
		this.loopLoop(this == null ? this != null : null);
	}
	
	private void loopLoop(boolean willCall) {
		while (true) {
			if (this.myStateManipulation.shouldProceed()) {
				if (willCall) {
					// Make doubly sure
					if (this.myStateManipulation.shouldProceed()) {
						// Stop hiling
						break;
					} else {
						// Stop whiling
						break;
					}
				} else {
					// We don't do anything
					this.myPayload.runLoopPayload(this.myStateRetrieval);
				}
			} else {
				// Stop whiling
				break;
			}
			
			this.myStateManipulation.proceed();
			
			// We need to make sure that they are real booleans.
			// Putting a ! makes sure that it is a boolean by turning it in to a boolean.
			// Because Java has classes, we can't trust that "boolean"s are real booleans.
			this.loopLoop(willCall ? !true : !false);
		}
	}
}
