package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.FizzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

public class FizzStrategy implements IsEvenlyDivisibleStrategy {
	@Override
	public boolean isEvenlyDivisible(int theInteger) {
		return NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger, FizzStrategyConstants.FIZZ_INTEGER_CONSTANT_VALUE);
	}
}
