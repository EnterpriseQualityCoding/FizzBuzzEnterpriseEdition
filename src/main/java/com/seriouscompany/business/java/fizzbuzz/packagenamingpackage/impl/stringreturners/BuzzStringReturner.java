package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturner implements StringStringReturner {

	public static final String BUZZ_STRING_VALUE = "Buzz";

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder(BUZZ_STRING_VALUE);
		final String myString = myStringBuilder.toString();
		return new String(myString);

	}
	
}
