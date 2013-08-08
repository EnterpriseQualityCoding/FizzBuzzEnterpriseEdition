package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;

public class NumberIsMultipleOfAnotherNumberVerifier {
	public static boolean numberIsMultipleOfAnotherNumber(int nFirstNumber, int nSecondNumber) {
		try{
			ThreeWayIntegerComparisonResult validationResult =
				ThreeWayIntegerComparator.Compare((IntegerDivider.divide(nFirstNumber, nSecondNumber)) * nSecondNumber, nFirstNumber);
			if (validationResult == ThreeWayIntegerComparisonResult.FirstEqualsSecond) {
				return true;
			} else {
				return false;
			}
		} catch( ArithmeticException ae ){
			return false;
		}
	}
}
