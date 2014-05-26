package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.IntegerForEqualityComparator;

public class NumberIsMultipleOfAnotherNumberVerifier {
	public static boolean numberIsMultipleOfAnotherNumber(int nFirstNumber, int nSecondNumber) {
		try{
			final int nDivideFirstIntegerBySecondIntegerResult =
				(IntegerDivider.divide(nFirstNumber, nSecondNumber));
			final int nMultiplyDivisionResultBySecondIntegerResult =
				nDivideFirstIntegerBySecondIntegerResult * nSecondNumber;
			return IntegerForEqualityComparator.areTwoIntegersEqual(nMultiplyDivisionResultBySecondIntegerResult, nFirstNumber);
		} catch( ArithmeticException ae ){
			return false;
		}
	}
}
