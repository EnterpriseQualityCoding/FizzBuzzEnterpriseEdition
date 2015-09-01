package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzExceptionSafeOutputStrategy;

import javax.annotation.Nonnull;

public final class FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter implements FizzBuzzExceptionSafeOutputStrategy {

	@Nonnull
	private final FizzBuzzOutputStrategy _fizzBuzzOutputStrategy;

	@Nonnull
	public FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(@Nonnull final FizzBuzzOutputStrategy fizzBuzzOutputStrategy) {
		this._fizzBuzzOutputStrategy = fizzBuzzOutputStrategy;
	}

	@Override
	public void output(@Nonnull final String outputStringToOutput) {
		try {
			this._fizzBuzzOutputStrategy.output(outputStringToOutput);
		} catch (final Exception exceptionFromDoingOutput) {
			// We're the enterprise...we don't get exceptions!
		} catch (final Throwable throwableFromDoingOutput) {
			// We're the enterprise...we don't get throwables either!
		}
	}
}
