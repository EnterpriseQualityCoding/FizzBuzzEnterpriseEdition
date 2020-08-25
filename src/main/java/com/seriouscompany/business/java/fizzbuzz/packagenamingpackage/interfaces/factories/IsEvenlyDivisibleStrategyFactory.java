package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

/**
 * Factory for IsEvenlyDivisibleStrategy
 */
public interface IsEvenlyDivisibleStrategyFactory {

	/**
	 * @return
	 */
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy();

}
