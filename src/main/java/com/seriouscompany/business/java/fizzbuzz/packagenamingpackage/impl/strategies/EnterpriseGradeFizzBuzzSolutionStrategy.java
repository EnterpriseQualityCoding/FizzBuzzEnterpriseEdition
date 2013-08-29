package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopRunner;

public class EnterpriseGradeFizzBuzzSolutionStrategy implements FizzBuzzSolutionStrategy {

	@Override
	public void runSolution(int nFizzBuzzUpperLimit) {
		LoopContext loopContext = new LoopContext(nFizzBuzzUpperLimit);
		SingleStepPayload stepPayload = new SingleStepPayload();
		LoopRunner loopRunner = new LoopRunner(loopContext, loopContext, stepPayload);
		loopRunner.runLoop();
	}
}
