package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class IntegerIntegerStringReturner implements IntegerStringReturner {

	public String getIntegerReturnString(int theInteger) {
		Integer myInteger = new Integer(theInteger);
		StringBuilder myStringBuilder = new StringBuilder(myInteger.toString());
		String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
