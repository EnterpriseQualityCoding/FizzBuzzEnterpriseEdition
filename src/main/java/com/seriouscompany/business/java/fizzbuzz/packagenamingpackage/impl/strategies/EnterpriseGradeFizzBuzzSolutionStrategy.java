package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopRunner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

@Service
public class EnterpriseGradeFizzBuzzSolutionStrategy implements FizzBuzzSolutionStrategy {

	private final LoopPayloadExecution _loopPayloadExecution;

	@Autowired
	public EnterpriseGradeFizzBuzzSolutionStrategy(final LoopPayloadExecution _loopPayloadExecution) {
		super();
		this._loopPayloadExecution = _loopPayloadExecution;
	}

	@Override
	public void runSolution(final int nFizzBuzzUpperLimit) {
		final LoopContext loopContext = new LoopContext(nFizzBuzzUpperLimit);
		final LoopRunner loopRunner = new LoopRunner(loopContext, loopContext, this._loopPayloadExecution);
		loopRunner.runLoop();
	}

}
