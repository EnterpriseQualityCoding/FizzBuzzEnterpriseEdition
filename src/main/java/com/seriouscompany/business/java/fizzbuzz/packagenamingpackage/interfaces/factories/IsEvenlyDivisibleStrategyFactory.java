package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

import javax.annotation.Nonnull;

public interface IsEvenlyDivisibleStrategyFactory {
	@Nonnull
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy();
}
