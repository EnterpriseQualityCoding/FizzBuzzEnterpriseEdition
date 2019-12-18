package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.SingleStepOutputGenerationParameter;

/**
 * Adapter for LoopContextStateRetrievalToSingleStepOutputGeneration
 */
public final class LoopContextStateRetrievalToSingleStepOutputGenerationAdapter implements SingleStepOutputGenerationParameter {

	private final LoopContextStateRetrieval _retrievalObjectToAdapt;

	/**
	 * @param retrievalObjectToAdapt LoopContextStateRetrieval
	 */
	public LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(final LoopContextStateRetrieval retrievalObjectToAdapt) {
		super();
		this._retrievalObjectToAdapt = retrievalObjectToAdapt;

	}

	/**
	 * @return int
	 */
	@Override
	public int retrieveIntegerValue() {
		return this._retrievalObjectToAdapt.getControlParameter();
	}

}
