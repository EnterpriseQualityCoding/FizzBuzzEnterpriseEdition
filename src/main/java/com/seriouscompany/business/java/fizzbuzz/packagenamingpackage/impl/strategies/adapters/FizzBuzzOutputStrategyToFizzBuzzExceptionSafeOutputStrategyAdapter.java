package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzExceptionSafeOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public final class FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter implements FizzBuzzExceptionSafeOutputStrategy {

	private  final FizzBuzzOutputStrategy _fizzBuzzOutputStrategy;

	public FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(final FizzBuzzOutputStrategy fizzBuzzOutputStrategy) {
		super();
		this._fizzBuzzOutputStrategy = fizzBuzzOutputStrategy;
	}

	@Override
	public void output(final String outputStringToOutput) {
		try {
			this._fizzBuzzOutputStrategy.output(outputStringToOutput);
		} catch (final Exception exceptionFromDoingOutput) {
			// We're the enterprise...we don't get exceptions!
		} catch (final Throwable throwableFromDoingOutput) {
			// We're the enterprise...we don't get throwables either!
		}
	}

}
