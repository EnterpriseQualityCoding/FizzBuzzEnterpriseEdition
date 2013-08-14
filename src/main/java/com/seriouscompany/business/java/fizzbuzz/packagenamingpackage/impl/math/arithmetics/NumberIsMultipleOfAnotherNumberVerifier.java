package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.IntegerForEqualityComparator;

public class NumberIsMultipleOfAnotherNumberVerifier {
	public static boolean numberIsMultipleOfAnotherNumber(int nFirstNumber, int nSecondNumber) {
		try{
			int nDivideFirstIntegerBySecondIntegerResult =
				(IntegerDivider.divide(nFirstNumber, nSecondNumber));
			int nMultiplyDivisionResultBySecondIntegerResult =
				nDivideFirstIntegerBySecondIntegerResult * nSecondNumber;
			if (IntegerForEqualityComparator.areTwoIntegersEqual(nMultiplyDivisionResultBySecondIntegerResult, nFirstNumber)) {
				return true;
			} else {
				return false;
			}
		} catch( ArithmeticException ae ){
			return false;
		}
	}
}
