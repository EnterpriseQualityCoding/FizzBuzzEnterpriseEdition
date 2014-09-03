package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.strategies.NewLineStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

public class NewLineStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		final NewLineStrategy myNewLineStrategy = new NewLineStrategy();
		return myNewLineStrategy;
	}

}
