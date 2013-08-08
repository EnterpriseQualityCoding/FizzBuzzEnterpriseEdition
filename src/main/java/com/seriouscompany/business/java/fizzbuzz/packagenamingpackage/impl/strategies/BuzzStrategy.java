package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.BuzzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

public class BuzzStrategy implements IsEvenlyDivisibleStrategy {
	public boolean isEvenlyDivisible(int theInteger) {
		if (NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger, BuzzStrategyConstants.BUZZ_INTEGER_CONSTANT_VALUE)) {
			return true;
		} else {
			return false;
		}
	}
}
