package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturner implements StringStringReturner {

	public static final String FIZZ_STRING_VALUE = "Fizz";

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder(FIZZ_STRING_VALUE);
		final String myString = myStringBuilder.toString();
		return new String(myString);
		
	}

}
