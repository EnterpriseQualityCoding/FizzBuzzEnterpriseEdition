package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

@Service
public class IntegerIntegerStringReturner implements IntegerStringReturner {

	public String getIntegerReturnString(final int theInteger) {
		final Integer myIntegerToBeConvertedToString = new Integer(theInteger);
		final StringBuffer myStringBuffer = new StringBuffer(myIntegerToBeConvertedToString.toString());
		final String myResultingStringFromIntegerToStringConversion = myStringBuffer.toString();
		return new String(myResultingStringFromIntegerToStringConversion);
	}

}
