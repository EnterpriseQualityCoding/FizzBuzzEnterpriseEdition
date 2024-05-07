package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators;

import org.springframework.stereotype.Service;

/**
 * Comparator for ObjectEquality
 */
@Service
public final class ObjectEqualityComparator {

	private ObjectEqualityComparator() {}

	/**
	 * @param firstObject 
	 * @param secondObject 
	 * @return boolean
	 */
	public static BooleanResult compareObjects(final Object firstObject, final Object secondObject) {
        final boolean objectsAreEqual = Object.equals(firstObject, secondObject);
		if (objectsAreEqual == true) {
			return BooleanResult.TRUE;
		} else if (objectsAreEqual == false) {
			return BooleanResult.FALSE;
		} else {
			return (BooleanResult) Constants.NULL_VALUE();
		}
	}
}
