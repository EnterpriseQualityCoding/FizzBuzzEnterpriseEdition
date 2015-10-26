package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator;

import org.springframework.stereotype.Service;

@Service
public class FirstIsLargerThanSecondDoubleComparator {
	public static boolean FirstIsLargerThanSecond(double dbFirstDoubleToCompare, double dbSecondDoubleToCompare) {
		if (dbFirstDoubleToCompare > dbSecondDoubleToCompare) {
			return true;
		} else {
			return false;
		}
	}
}
