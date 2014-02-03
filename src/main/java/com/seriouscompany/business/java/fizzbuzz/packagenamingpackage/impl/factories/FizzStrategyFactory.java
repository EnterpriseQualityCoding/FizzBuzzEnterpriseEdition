package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.FizzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

public class FizzStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		final FizzStrategy myFizzStrategy = new FizzStrategy();
		return myFizzStrategy;
	}

}
