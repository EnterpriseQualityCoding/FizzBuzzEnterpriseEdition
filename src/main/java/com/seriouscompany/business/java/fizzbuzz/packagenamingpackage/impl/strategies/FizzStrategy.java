package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.FizzStrategyConstants;

public class FizzStrategy implements IsEvenlyDivisibleStrategy {
	public boolean isEvenlyDivisible(int i) {
		if ((((int)(i / FizzStrategyConstants.FIZZ_INTEGER_CONSTANT_VALUE)) * FizzStrategyConstants.FIZZ_INTEGER_CONSTANT_VALUE == i)) {
			return true;
		} else {
			return false;
		}
	}
}
