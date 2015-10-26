package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.IntegerForEqualityComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator.FirstIsSmallerThanSecondDoubleComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator.FirstIsLargerThanSecondDoubleComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.converters.primitivetypesconverters.DoubleToIntConverter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.converters.primitivetypesconverters.IntToDoubleConverter;

@Service
public class IntegerDivider {

	public static final int INTEGER_DIVIDE_ZERO_VALUE = 0;
	public static final int INTEGER_ORIGIN_ZERO_VALUE = 0;

	private final FirstIsSmallerThanSecondDoubleComparator firstIsSmallerThanSecondDoubleComparator;
	private final FirstIsLargerThanSecondDoubleComparator firstIsLargerThanSecondDoubleComparator;

	@Autowired
	public IntegerDivider(final FirstIsLargerThanSecondDoubleComparator firstIsLargerThanSecondDoubleComparator,
			final FirstIsSmallerThanSecondDoubleComparator firstIsSmallerThanSecondDoubleComparator) {
		this.firstIsLargerThanSecondDoubleComparator = firstIsLargerThanSecondDoubleComparator;
		this.firstIsSmallerThanSecondDoubleComparator = firstIsSmallerThanSecondDoubleComparator;
	}

	public int divide(final int nFirstInteger, final int nSecondInteger) {
		final boolean denominatorEqualsZero =
				IntegerForEqualityComparator.areTwoIntegersEqual(nSecondInteger, IntegerDivider.INTEGER_DIVIDE_ZERO_VALUE);
		if (denominatorEqualsZero) {
			throw new ArithmeticException("An attempt was made to divide by zero.");
		} else {
			final double dbFirstNumber = IntToDoubleConverter.Convert(nFirstInteger);
			final double dbSecondNumber = IntToDoubleConverter.Convert(nSecondInteger);
			final double dbQuotient = dbFirstNumber / dbSecondNumber;
			double dbRoundedQuotient = (double) IntegerDivider.INTEGER_ORIGIN_ZERO_VALUE;
			if (this.firstIsSmallerThanSecondDoubleComparator.FirstIsSmallerThanSecond(dbQuotient,
					(double) IntegerDivider.INTEGER_ORIGIN_ZERO_VALUE)) {
				dbRoundedQuotient = Math.ceil(dbQuotient);
			} else if (this.firstIsLargerThanSecondDoubleComparator.FirstIsLargerThanSecond(dbQuotient,
					(double) IntegerDivider.INTEGER_ORIGIN_ZERO_VALUE)) {
				dbRoundedQuotient = Math.floor(dbQuotient);
			}
			final int nIntegerQuotient = DoubleToIntConverter.Convert(dbRoundedQuotient);
			return nIntegerQuotient;
		}
	}
}
