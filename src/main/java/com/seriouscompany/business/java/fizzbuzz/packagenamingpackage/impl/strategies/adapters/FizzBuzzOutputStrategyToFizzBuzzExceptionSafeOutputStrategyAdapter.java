package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzExceptionSafeOutputStrategy;

public class FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter implements FizzBuzzExceptionSafeOutputStrategy {

	public FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(
				final FizzBuzzOutputStrategy fizzBuzzOutputStrategyToAdapt)
	{
		myFizzBuzzOutputStrategyToAdapt = fizzBuzzOutputStrategyToAdapt;	
	}

	@Override
	public void output(final String outputStringToOutput) {
		try {
			myFizzBuzzOutputStrategyToAdapt.output(outputStringToOutput);
		} catch (Exception exceptionFromDoingOutput) {
			// We're the enterprise...we don't get exceptions!
		}
	}

	final FizzBuzzOutputStrategy myFizzBuzzOutputStrategyToAdapt;

}
