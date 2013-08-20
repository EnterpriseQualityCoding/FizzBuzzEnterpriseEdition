package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;

public class LoopContext {

	LoopInitializer myLoopInitializer;
	LoopFinalizer myLoopFinalizer;
	LoopCondition myLoopCondition;
	LoopStep myLoopStep;
	int myCurrentControlParameterValue;

	public LoopContext(int nLoopControlParameterFinalValue) {
		LoopComponentFactory myLoopComponentFactory = new LoopComponentFactory();
		myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nLoopControlParameterFinalValue);
		myLoopCondition = myLoopComponentFactory.createLoopCondition();
		myLoopStep = myLoopComponentFactory.createLoopStep();
	}

	public void start() {
		myCurrentControlParameterValue =
			myLoopInitializer.getLoopInitializationPoint();
	}

	public boolean shouldProceed() {
		return myLoopCondition.evaluateLoop(myCurrentControlParameterValue,
			myLoopFinalizer.getLoopFinalizationPoint());
	}

	public void proceed() {
		myCurrentControlParameterValue =
			myLoopStep.stepLoop(myCurrentControlParameterValue);
	}

	public int getControlParameter() {
		return myCurrentControlParameterValue;
	}

}
