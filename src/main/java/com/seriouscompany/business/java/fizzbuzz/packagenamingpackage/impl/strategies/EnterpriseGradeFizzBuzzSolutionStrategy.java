package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopStep;

public class EnterpriseGradeFizzBuzzSolutionStrategy implements FizzBuzzSolutionStrategy {

	@Override
	public void runSolution(int nFizzBuzzUpperLimit) {
		LoopComponentFactory myLoopComponentFactory = new LoopComponentFactory();
		LoopInitializer myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		LoopFinalizer myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nFizzBuzzUpperLimit);
		LoopCondition myLoopCondition = myLoopComponentFactory.createLoopCondition();
		LoopStep myLoopStep = myLoopComponentFactory.createLoopStep();

		SingleStepOutputGenerationStrategy myGenerationStrategy =
			new SingleStepOutputGenerationStrategy();

		for (int nCurrentNumber = myLoopInitializer.getLoopInitializationPoint(); myLoopCondition.evaluateLoop(nCurrentNumber, myLoopFinalizer.getLoopFinalizationPoint()); nCurrentNumber = myLoopStep.stepLoop(nCurrentNumber)) {
			myGenerationStrategy.performGenerationForCurrentStep(nCurrentNumber);
		}
	}
}
