package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.NoFizzNoBuzzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;

public class NoFizzNoBuzzStrategyFactory implements
		IsEvenlyDivisibleStrategyFactory {

	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		final NoFizzNoBuzzStrategy myNoFizzNoBuzzStrategy = new NoFizzNoBuzzStrategy();
		return myNoFizzNoBuzzStrategy;
	}

}
