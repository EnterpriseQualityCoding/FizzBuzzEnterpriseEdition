package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class IntegerIntegerStringReturner implements IntegerStringReturner {

	@Override
	public String getIntegerReturnString(int theInteger) {
		final Integer myInteger = theInteger;
		final StringBuilder myStringBuilder = new StringBuilder(myInteger.toString());
		final String myString = myStringBuilder.toString();
		return myString;
	}

}
