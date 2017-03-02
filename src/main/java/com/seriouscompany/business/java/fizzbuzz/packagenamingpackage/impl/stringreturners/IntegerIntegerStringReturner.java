package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

/**
 * Returner for IntegerIntegerString
 */
@Service
public class IntegerIntegerStringReturner implements IntegerStringReturner {

	/**
	 * @param theInteger ing
	 * @return String
	 */
	public String getIntegerReturnString(final int theInteger) {
		final Integer myIntegerToBeConvertedToString = new Integer(theInteger);
		final StringBuilder myStringBuilder = new StringBuilder(myIntegerToBeConvertedToString.toString());
		final String myResultingStringFromIntegerToStringConversion = myStringBuilder.toString();
		return new String(myResultingStringFromIntegerToStringConversion);
	}

}
