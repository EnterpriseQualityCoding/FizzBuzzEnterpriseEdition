package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.constants.NewLineStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

public class NewLineStrategy implements IsEvenlyDivisibleStrategy {
	public boolean isEvenlyDivisible(int theInteger) {
		if (NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger, NewLineStrategyConstants.NEWLINE_INTEGER_CONSTANT_VALUE)) {
			return true;
		} else {
			return false;
		}
	}
}
