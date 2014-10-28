package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzExceptionSafeOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter implements FizzBuzzExceptionSafeOutputStrategy {

	public FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(
				FizzBuzzOutputStrategy fizzBuzzOutputStrategyToAdapt)
	{
		myFizzBuzzOutputStrategyToAdapt = fizzBuzzOutputStrategyToAdapt;	
	}

	@Override
	public void output(String outputStringToOutput) {
		try {
			myFizzBuzzOutputStrategyToAdapt.output(outputStringToOutput);
		} catch (Exception exceptionFromDoingOutput) {
			// We're the enterprise...we don't get exceptions!
		}
	}

	private final FizzBuzzOutputStrategy myFizzBuzzOutputStrategyToAdapt;

}
