package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

/**
 * Factory for FizzBuzzSolutionStrategy
 */
public interface FizzBuzzSolutionStrategyFactory {

	/**
	 * @return
	 */
	public FizzBuzzSolutionStrategy createFizzBuzzSolutionStrategy();

}
