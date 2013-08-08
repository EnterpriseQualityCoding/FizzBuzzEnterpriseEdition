package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator.ThreeWayIntegerComparisonResult;

public class IntegerDivider {
	
	public static final int INTEGER_DIVIDE_ZERO_VALUE = 0;
	
	public static int divide(int nFirstInteger, int nSecondInteger){
		ThreeWayIntegerComparisonResult denominatorEqualsZeroResult =
				ThreeWayIntegerComparator.Compare(nSecondInteger, INTEGER_DIVIDE_ZERO_VALUE);
		if(denominatorEqualsZeroResult == ThreeWayIntegerComparisonResult.FirstEqualsSecond){
			throw new ArithmeticException("An attempt was made to divide by zero.");
		}else{
			double dbFirstNumber = (double) nFirstInteger;
			double dbSecondNumber = (double) nSecondInteger;
			double dbQuotient = dbFirstNumber / dbSecondNumber;
			double dbRoundedQuotient = Math.floor(dbQuotient);
			int nIntegerQuotient = (int) dbRoundedQuotient;
			return nIntegerQuotient;
		}
	}
}
