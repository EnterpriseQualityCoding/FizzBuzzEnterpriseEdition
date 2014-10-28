package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.LoopContextStateRetrievalToSingleStepOutputGenerationAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;

public class SingleStepPayload implements LoopPayloadExecution {

	SingleStepOutputGenerationStrategy myGenerator;

	public SingleStepPayload() {
		myGenerator = new SingleStepOutputGenerationStrategy();
	}

	@Override
	public void runLoopPayload(LoopContextStateRetrieval stateRetrieval) {
		final LoopContextStateRetrievalToSingleStepOutputGenerationAdapter adapter =
			new LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(stateRetrieval);
		myGenerator.performGenerationForCurrentStep(adapter);
	}

}
