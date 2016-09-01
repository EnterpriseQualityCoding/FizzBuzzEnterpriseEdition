package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.SingleStepOutputGenerationParameter;

public final class LoopContextStateRetrievalToSingleStepOutputGenerationAdapter implements SingleStepOutputGenerationParameter {

	private final LoopContextStateRetrieval _retrievalObjectToAdapt;

	public LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(final LoopContextStateRetrieval retrievalObjectToAdapt) {
		super();
		this._retrievalObjectToAdapt = retrievalObjectToAdapt;

	}

	@Override
	public int retrieveIntegerValue() {
		return this._retrievalObjectToAdapt.getControlParameter();
	}

}
