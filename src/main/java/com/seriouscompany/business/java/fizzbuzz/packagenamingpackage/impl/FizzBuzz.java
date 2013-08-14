package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopStep;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.SingleStepOutputGenerationStrategy;

public class FizzBuzz {
	public void fizzbuzz(int nTotalCount) {
		
		LoopComponentFactory myLoopComponentFactory = new LoopComponentFactory();
		LoopInitializer myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		LoopFinalizer myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nTotalCount);
		LoopCondition myLoopCondition = myLoopComponentFactory.createLoopCondition();
		LoopStep myLoopStep = myLoopComponentFactory.createLoopStep();
		
		SingleStepOutputGenerationStrategy myGenerationStrategy =
			new SingleStepOutputGenerationStrategy();
		
		for (int nCurrentNumber = myLoopInitializer.getLoopInitializationPoint(); myLoopCondition.evaluateLoop(nCurrentNumber, myLoopFinalizer.getLoopFinalizationPoint()); nCurrentNumber = myLoopStep.stepLoop(nCurrentNumber)) {
			myGenerationStrategy.performGenerationForCurrentStep(nCurrentNumber);
		}
	}
}
