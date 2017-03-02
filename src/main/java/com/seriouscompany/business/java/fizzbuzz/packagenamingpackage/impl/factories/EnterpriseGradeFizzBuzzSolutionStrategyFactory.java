package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

/**
 * Factory for EnterpriseGradeFizzBuzzSolutionStrategy
 */
@Service
public class EnterpriseGradeFizzBuzzSolutionStrategyFactory implements FizzBuzzSolutionStrategyFactory {

	private final FizzBuzzSolutionStrategy _fizzBuzzSolutionStrategy;

	/**
	 * @param _fizzBuzzSolutionStrategy FizzBuzzSolutionStrategy
	 */
	@Autowired
	public EnterpriseGradeFizzBuzzSolutionStrategyFactory(final FizzBuzzSolutionStrategy _fizzBuzzSolutionStrategy) {
		super();
		this._fizzBuzzSolutionStrategy = _fizzBuzzSolutionStrategy;
	}

	/**
	 * @return FizzBuzzSolutionStrategy
	 */
	@Override
	public FizzBuzzSolutionStrategy createFizzBuzzSolutionStrategy() {
		return this._fizzBuzzSolutionStrategy;
	}

}
