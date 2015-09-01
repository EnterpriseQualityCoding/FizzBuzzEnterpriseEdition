package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.SingleStepOutputGenerationParameter;

import javax.annotation.Nonnull;

public final class LoopContextStateRetrievalToSingleStepOutputGenerationAdapter implements SingleStepOutputGenerationParameter {

	@Nonnull
	private final LoopContextStateRetrieval _retrievalObjectToAdapt;
	
	public LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(@Nonnull final LoopContextStateRetrieval retrievalObjectToAdapt) {
		this._retrievalObjectToAdapt = retrievalObjectToAdapt;
		
	}

	@Override
	public int retrieveIntegerValue() {
		return this._retrievalObjectToAdapt.getControlParameter();
	}

}
