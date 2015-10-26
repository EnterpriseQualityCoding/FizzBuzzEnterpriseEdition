package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopRunner;

@Service
public class EnterpriseGradeFizzBuzzSolutionStrategy implements FizzBuzzSolutionStrategy {

	@Autowired
	private LoopPayloadExecution _loopPayloadExecution;
	
	@Override
	public void runSolution(int nFizzBuzzUpperLimit) {
		final LoopContext loopContext = new LoopContext(nFizzBuzzUpperLimit);
		final LoopRunner loopRunner = new LoopRunner(loopContext, loopContext, _loopPayloadExecution);
		loopRunner.runLoop();
	}
}
