package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.IntegerForEqualityComparator;

@Service
public class NumberIsMultipleOfAnotherNumberVerifier {

	private static IntegerDivider integerDivider;

	@Autowired
	public NumberIsMultipleOfAnotherNumberVerifier(final IntegerDivider integerDivider) {
		this.integerDivider = integerDivider;
	}

	public static boolean numberIsMultipleOfAnotherNumber(final int nFirstNumber, final int nSecondNumber) {
		try {
			final int nDivideFirstIntegerBySecondIntegerResult =
					(NumberIsMultipleOfAnotherNumberVerifier.integerDivider.divide(nFirstNumber, nSecondNumber));
			final int nMultiplyDivisionResultBySecondIntegerResult =
					nDivideFirstIntegerBySecondIntegerResult * nSecondNumber;
			if (IntegerForEqualityComparator.areTwoIntegersEqual(nMultiplyDivisionResultBySecondIntegerResult,
					nFirstNumber)) {
				return true;
			} else {
				return false;
			}
		} catch (final ArithmeticException ae) {
			return false;
		}
	}
}
