package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.SingleStepOutputGenerationParameter;

public class LoopContextStateRetrievalToSingleStepOutputGenerationAdapter implements SingleStepOutputGenerationParameter {

	private LoopContextStateRetrieval _retrievalObjectToAdapt;
	
	public LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(LoopContextStateRetrieval retrievalObjectToAdapt) {
		this._retrievalObjectToAdapt = retrievalObjectToAdapt;
		
	}

	@Override
	public int retrieveIntegerValue() {
		return this._retrievalObjectToAdapt.getControlParameter();
	}

}
