package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.SingleStepOutputGenerationParameter;

public class LoopContextStateRetrievalToSingleStepOutputGenerationAdapter implements SingleStepOutputGenerationParameter {

	private LoopContextStateRetrieval myRetrievalObjectToAdapt;

	public LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(LoopContextStateRetrieval retrievalToAdapt) {
		myRetrievalObjectToAdapt = retrievalToAdapt;
	}

	@Override
	public int retrieveIntegerValue() {
		return myRetrievalObjectToAdapt.getControlParameter();
	}

}
