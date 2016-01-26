package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator;

import org.springframework.stereotype.Service;

@Service
public class FirstIsSmallerThanSecondDoubleComparator {
	public  boolean firstIsSmallerThanSecond(final double dbFirstDoubleToCompare, final double dbSecondDoubleToCompare) {
		return dbFirstDoubleToCompare < dbSecondDoubleToCompare;
	}
}
