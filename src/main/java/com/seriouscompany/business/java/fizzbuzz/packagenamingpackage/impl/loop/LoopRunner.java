package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;

import javax.annotation.Nonnull;

public final class LoopRunner {

	@Nonnull
	private final LoopContextStateManipulation myStateManipulation;
	@Nonnull
	private final LoopContextStateRetrieval myStateRetrieval;
	@Nonnull
	private final LoopPayloadExecution myPayload;

	public LoopRunner(@Nonnull final LoopContextStateManipulation stateManipulation,
					  @Nonnull final LoopContextStateRetrieval stateRetrieval,
					  @Nonnull final LoopPayloadExecution payload) {
		this.myStateManipulation = stateManipulation;
		this.myStateRetrieval = stateRetrieval;
		this.myPayload = payload;
	}

	public void runLoop() {
		for (this.myStateManipulation.start(); this.myStateManipulation.shouldProceed(); this.myStateManipulation.proceed()) {
			this.myPayload.runLoopPayload(this.myStateRetrieval);
		}
	}

}
