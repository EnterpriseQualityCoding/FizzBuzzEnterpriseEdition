package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.constants.FizzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

public class FizzStrategy implements IsEvenlyDivisibleStrategy {
	public boolean isEvenlyDivisible(int theInteger) {
		if (NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger, FizzStrategyConstants.FIZZ_INTEGER_CONSTANT_VALUE)) {
			return true;
		} else {
			return false;
		}
	}
}
