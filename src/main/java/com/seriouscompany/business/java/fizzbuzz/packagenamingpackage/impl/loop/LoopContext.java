package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzParameterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzLowerLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzStepParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;

public class LoopContext implements LoopContextStateManipulation, LoopContextStateRetrieval {

	LoopInitializer myLoopInitializer;
	LoopFinalizer myLoopFinalizer;
	LoopCondition myLoopCondition;
	LoopStep myLoopStep;
	int myCurrentControlParameterValue;

	public LoopContext(FizzBuzzParameterFactory parameterFactory) {
        final FizzBuzzLowerLimitParameter lowerLimitParameter = parameterFactory.createLowerLimitParameter();
        final FizzBuzzUpperLimitParameter upperLimitParameter = parameterFactory.createUpperLimitParameter();
        final FizzBuzzStepParameter stepParameter = parameterFactory.createStepParameter();

		final LoopComponentFactory myLoopComponentFactory = new LoopComponentFactory();
		myLoopInitializer = myLoopComponentFactory.createLoopInitializer(lowerLimitParameter.ObtainLowerLimitValue());
		myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(upperLimitParameter.ObtainUpperLimitValue());
		myLoopCondition = myLoopComponentFactory.createLoopCondition();
		myLoopStep = myLoopComponentFactory.createLoopStep(stepParameter.ObtainStepValue());
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
