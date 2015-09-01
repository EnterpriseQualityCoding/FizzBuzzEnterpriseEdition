package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

import javax.annotation.Nonnull;

@Service
public class StandardFizzBuzz implements FizzBuzz {

	@Nonnull
	private final FizzBuzzSolutionStrategyFactory _fizzBuzzSolutionStrategyFactory;

	@Autowired
	public StandardFizzBuzz(@Nonnull final FizzBuzzSolutionStrategyFactory _fizzBuzzSolutionStrategyFactory) {
		this._fizzBuzzSolutionStrategyFactory = _fizzBuzzSolutionStrategyFactory;
	}

	public void fizzBuzz(final int nFizzBuzzUpperLimit) {
		final FizzBuzzSolutionStrategy mySolutionStrategy =
				this._fizzBuzzSolutionStrategyFactory.createFizzBuzzSolutionStrategy();
		mySolutionStrategy.runSolution(nFizzBuzzUpperLimit);
	}
}
