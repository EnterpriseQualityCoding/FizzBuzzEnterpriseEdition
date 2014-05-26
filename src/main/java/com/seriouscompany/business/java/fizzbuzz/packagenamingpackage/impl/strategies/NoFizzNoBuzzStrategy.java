package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.NoFizzNoBuzzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

public class NoFizzNoBuzzStrategy implements IsEvenlyDivisibleStrategy {

	@Override
	public boolean isEvenlyDivisible(int theInteger) {
		if (!NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger, NoFizzNoBuzzStrategyConstants.NO_FIZZ_INTEGER_CONSTANT_VALUE)) {
			return !NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger, NoFizzNoBuzzStrategyConstants.NO_BUZZ_INTEGER_CONSTANT_VALUE);
		} else if (!NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger, NoFizzNoBuzzStrategyConstants.NO_BUZZ_INTEGER_CONSTANT_VALUE)) {
			return !NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger, NoFizzNoBuzzStrategyConstants.NO_FIZZ_INTEGER_CONSTANT_VALUE);
		} else {
			return false;
		}
	}
	
}
