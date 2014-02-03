package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopRunner;

public class EnterpriseGradeFizzBuzzSolutionStrategy implements FizzBuzzSolutionStrategy {

	@Override
	public void runSolution(int nFizzBuzzUpperLimit) {
		final LoopContext loopContext = new LoopContext(nFizzBuzzUpperLimit);
		final SingleStepPayload stepPayload = new SingleStepPayload();
		final LoopRunner loopRunner = new LoopRunner(loopContext, loopContext, stepPayload);
		loopRunner.runLoop();
	}
}
