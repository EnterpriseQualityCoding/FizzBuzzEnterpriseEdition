package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopContext;

public class EnterpriseGradeFizzBuzzSolutionStrategy implements FizzBuzzSolutionStrategy {

	@Override
	public void runSolution(int nFizzBuzzUpperLimit) {
		LoopContext loopContext = new LoopContext(nFizzBuzzUpperLimit);
		SingleStepOutputGenerationStrategy myGenerationStrategy =
			new SingleStepOutputGenerationStrategy();

		for (loopContext.start(); loopContext.shouldProceed(); loopContext.proceed()) {
			myGenerationStrategy.performGenerationForCurrentStep(loopContext.getControlParameter());
		}
	}
}
