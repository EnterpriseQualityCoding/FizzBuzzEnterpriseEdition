package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator.FirstIsLargerThanSecondDoubleComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator.FirstIsSmallerThanSecondDoubleComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.IntegerForEqualityComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.converters.primitivetypesconverters.DoubleToIntConverter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.converters.primitivetypesconverters.IntToDoubleConverter;

/**
 * IntegerDivider
 */
@Service
public class IntegerDivider {

	private final FirstIsSmallerThanSecondDoubleComparator firstIsSmallerThanSecondDoubleComparator;
	private final FirstIsLargerThanSecondDoubleComparator firstIsLargerThanSecondDoubleComparator;

	/**
	 * @param firstIsLargerThanSecondDoubleComparator FirstIsLargerThanSecondDoubleComparator
	 * @param firstIsSmallerThanSecondDoubleComparator FirstIsSmallerThanSecondDoubleComparator
	 */
	@Autowired
	public IntegerDivider(final FirstIsLargerThanSecondDoubleComparator firstIsLargerThanSecondDoubleComparator,
			final FirstIsSmallerThanSecondDoubleComparator firstIsSmallerThanSecondDoubleComparator) {
		super();
		this.firstIsLargerThanSecondDoubleComparator = firstIsLargerThanSecondDoubleComparator;
		this.firstIsSmallerThanSecondDoubleComparator = firstIsSmallerThanSecondDoubleComparator;
	}

	/**
	 * @param nFirstInteger int
	 * @param nSecondInteger int
	 * @return int
	 */
	public int divide(final int nFirstInteger, final int nSecondInteger) {
		final boolean denominatorEqualsZero =
				IntegerForEqualityComparator.areTwoIntegersEqual(nSecondInteger, Constants.INTEGER_DIVIDE_ZERO_VALUE);
		if (denominatorEqualsZero) {
			throw new ArithmeticException(Constants.AN_ATTEMPT_WAS_MADE_TO_DIVIDE_BY_ZERO);
		} else {
			final double dbFirstNumber = IntToDoubleConverter.Convert(nFirstInteger);
			final double dbSecondNumber = IntToDoubleConverter.Convert(nSecondInteger);
			final double dbQuotient = dbFirstNumber / dbSecondNumber;
			double dbRoundedQuotient = (double) Constants.INTEGER_ORIGIN_ZERO_VALUE;
			if (this.firstIsSmallerThanSecondDoubleComparator.FirstIsSmallerThanSecond(dbQuotient,
					(double) Constants.INTEGER_ORIGIN_ZERO_VALUE)) {
				dbRoundedQuotient = Math.ceil(dbQuotient);
			} else if (this.firstIsLargerThanSecondDoubleComparator.FirstIsLargerThanSecond(dbQuotient,
					(double) Constants.INTEGER_ORIGIN_ZERO_VALUE)) {
				dbRoundedQuotient = Math.floor(dbQuotient);
			}
			final int nIntegerQuotient = DoubleToIntConverter.Convert(dbRoundedQuotient);
			return nIntegerQuotient;
		}
	}

}
