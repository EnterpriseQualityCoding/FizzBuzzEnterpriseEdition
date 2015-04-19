package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.OutputGenerationStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.LoopContextStateRetrievalToSingleStepOutputGenerationAdapter;

@Service
public class SingleStepPayload implements LoopPayloadExecution {

	@Autowired
	OutputGenerationStrategy _outputGenerationStrategy;	

	@Override
	public void runLoopPayload(LoopContextStateRetrieval stateRetrieval) {
		final LoopContextStateRetrievalToSingleStepOutputGenerationAdapter adapter =
			new LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(stateRetrieval);
		_outputGenerationStrategy.performGenerationForCurrentStep(adapter);
	}

}
