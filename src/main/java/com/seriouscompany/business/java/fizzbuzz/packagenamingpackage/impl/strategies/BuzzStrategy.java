package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.BuzzStrategyConstants;
public class BuzzStrategy implements IsEvenlyDivisibleStrategy {
	public boolean isEvenlyDivisible(int i) {
		if ((((int)(i / BuzzStrategyConstants.BUZZ_INTEGER_CONSTANT_VALUE)) * BuzzStrategyConstants.BUZZ_INTEGER_CONSTANT_VALUE == i)) {
			return true;
		} else {
			return false;
		}
	}
}
