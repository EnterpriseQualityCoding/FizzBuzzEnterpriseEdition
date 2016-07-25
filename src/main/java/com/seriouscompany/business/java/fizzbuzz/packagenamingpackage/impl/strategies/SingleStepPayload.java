package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.LoopContextStateRetrievalToSingleStepOutputGenerationAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.OutputGenerationStrategy;

@Service
public class SingleStepPayload implements LoopPayloadExecution {

	private final OutputGenerationStrategy _outputGenerationStrategy;

	@Autowired
	public SingleStepPayload(final OutputGenerationStrategy _outputGenerationStrategy) {
		super();
		this._outputGenerationStrategy = _outputGenerationStrategy;
	}

	@Override
	public void runLoopPayload(final LoopContextStateRetrieval stateRetrieval) {
		final LoopContextStateRetrievalToSingleStepOutputGenerationAdapter adapter =
				new LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(stateRetrieval);
		this._outputGenerationStrategy.performGenerationForCurrentStep(adapter);
	}

}
