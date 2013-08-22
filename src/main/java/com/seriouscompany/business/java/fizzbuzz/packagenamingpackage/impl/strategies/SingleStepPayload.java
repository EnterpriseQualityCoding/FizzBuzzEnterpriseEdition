package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.LoopContextStateRetrievalToSingleStepOutputGenerationAdapter;

public class SingleStepPayload implements LoopPayloadExecution {

	SingleStepOutputGenerationStrategy myGenerator;

	public SingleStepPayload() {
		myGenerator = new SingleStepOutputGenerationStrategy();
	}

	@Override
	public void runLoopPayload(LoopContextStateRetrieval stateRetrieval) {
		LoopContextStateRetrievalToSingleStepOutputGenerationAdapter adapter =
			new LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(stateRetrieval);
		myGenerator.performGenerationForCurrentStep(adapter);
	}

}
