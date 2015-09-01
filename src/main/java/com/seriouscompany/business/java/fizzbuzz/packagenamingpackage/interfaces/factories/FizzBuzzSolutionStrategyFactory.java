package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

import javax.annotation.Nonnull;

public interface FizzBuzzSolutionStrategyFactory {

	@Nonnull
	public FizzBuzzSolutionStrategy createFizzBuzzSolutionStrategy();

}
