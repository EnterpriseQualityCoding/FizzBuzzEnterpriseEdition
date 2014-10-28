package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;

public class LoopContext implements LoopContextStateManipulation, LoopContextStateRetrieval {

	private final LoopInitializer myLoopInitializer;
    private final LoopFinalizer myLoopFinalizer;
    private final LoopCondition myLoopCondition;
    private final LoopStep myLoopStep;
    private int myCurrentControlParameterValue;

	public LoopContext(int nLoopControlParameterFinalValue) {
		final LoopComponentFactory myLoopComponentFactory = new LoopComponentFactory();
		myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nLoopControlParameterFinalValue);
		myLoopCondition = myLoopComponentFactory.createLoopCondition();
		myLoopStep = myLoopComponentFactory.createLoopStep();
	}

	@Override
	public void start() {
		myCurrentControlParameterValue =
			myLoopInitializer.getLoopInitializationPoint();
	}

	@Override
	public boolean shouldProceed() {
		return myLoopCondition.evaluateLoop(myCurrentControlParameterValue,
			myLoopFinalizer.getLoopFinalizationPoint());
	}

	@Override
	public void proceed() {
		myCurrentControlParameterValue =
			myLoopStep.stepLoop(myCurrentControlParameterValue);
	}

	@Override
	public int getControlParameter() {
		return myCurrentControlParameterValue;
	}

}
