package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.OutputGenerationStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.LoopContextStateRetrievalToSingleStepOutputGenerationAdapter;

import javax.annotation.Nonnull;

@Service
public class SingleStepPayload implements LoopPayloadExecution {

	@Nonnull
	private final OutputGenerationStrategy _outputGenerationStrategy;

	@Autowired
	public SingleStepPayload(@Nonnull final OutputGenerationStrategy _outputGenerationStrategy) {
		this._outputGenerationStrategy = _outputGenerationStrategy;
	}

	@Override
	public void runLoopPayload(@Nonnull final LoopContextStateRetrieval stateRetrieval) {
		final LoopContextStateRetrievalToSingleStepOutputGenerationAdapter adapter =
				new LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(stateRetrieval);
		this._outputGenerationStrategy.performGenerationForCurrentStep(adapter);
	}

}
