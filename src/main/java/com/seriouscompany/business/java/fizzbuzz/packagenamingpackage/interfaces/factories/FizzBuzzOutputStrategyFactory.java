package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

import javax.annotation.Nonnull;

public interface FizzBuzzOutputStrategyFactory {
	@Nonnull
	public FizzBuzzOutputStrategy createOutputStrategy();

}
