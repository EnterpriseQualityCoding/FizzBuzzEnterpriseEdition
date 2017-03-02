package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

/**
 * Factory for FizzBuzzOutputStrategy
 */
public interface FizzBuzzOutputStrategyFactory {

	/**
	 * @return
	 */
	public FizzBuzzOutputStrategy createOutputStrategy();

}
