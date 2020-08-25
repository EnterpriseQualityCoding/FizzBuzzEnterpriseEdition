package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator;

import org.springframework.stereotype.Service;

/**
 * Comparator for FirstIsSmallerThanSecondDouble
 */
@Service
public class FirstIsSmallerThanSecondDoubleComparator {

	/**
	 * @param dbFirstDoubleToCompare double
	 * @param dbSecondDoubleToCompare double
	 * @return boolean
	 */
	public  boolean FirstIsSmallerThanSecond(final double dbFirstDoubleToCompare, final double dbSecondDoubleToCompare) {
		if (dbFirstDoubleToCompare < dbSecondDoubleToCompare) {
			return true;
		} else {
			return false;
		}
	}
}
