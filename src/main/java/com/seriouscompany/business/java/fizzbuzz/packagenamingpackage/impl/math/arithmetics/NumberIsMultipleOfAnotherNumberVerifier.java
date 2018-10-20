package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.ApplicationContextHolder;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.IntegerForEqualityComparator;

@Service
public class NumberIsMultipleOfAnotherNumberVerifier {

	private static IntegerDivider integerDivider;

	@PostConstruct
	public void init() {
		final ApplicationContext applicationContext = ApplicationContextHolder.getApplicationContext();

		integerDivider = applicationContext.getBean(IntegerDivider.class);
	}

	public static boolean numberIsMultipleOfAnotherNumber(final int nFirstNumber, final int nSecondNumber) {
		try {
			final int nDivideFirstIntegerBySecondIntegerResult =
					(NumberIsMultipleOfAnotherNumberVerifier.integerDivider.divide(nFirstNumber, nSecondNumber));
			final int nMultiplyDivisionResultBySecondIntegerResult =
					nDivideFirstIntegerBySecondIntegerResult * nSecondNumber;
			return IntegerForEqualityComparator.areTwoIntegersEqual(nMultiplyDivisionResultBySecondIntegerResult,
					nFirstNumber);
		} catch (final ArithmeticException ae) {
			return false;
		}
	}

}
