package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

/**
 * Standard FizzBuzz
 */
@Service
public class StandardFizzBuzz implements FizzBuzz {

	private final FizzBuzzSolutionStrategyFactory _fizzBuzzSolutionStrategyFactory;

	/**
	 * @param _fizzBuzzSolutionStrategyFactory
	 */
	@Autowired
	public StandardFizzBuzz(final FizzBuzzSolutionStrategyFactory _fizzBuzzSolutionStrategyFactory) {
		super();
		this._fizzBuzzSolutionStrategyFactory = _fizzBuzzSolutionStrategyFactory;
	}

	/**
	 * @param nFizzBuzzUpperLimit
	 */
	public void fizzBuzz(final int nFizzBuzzUpperLimit) {
		final FizzBuzzSolutionStrategy mySolutionStrategy =
				this._fizzBuzzSolutionStrategyFactory.createFizzBuzzSolutionStrategy();
		mySolutionStrategy.runSolution(nFizzBuzzUpperLimit);
	}

}
