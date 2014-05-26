package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturner implements StringStringReturner {

	@Override
	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder("Fizz");
		final String myString = myStringBuilder.toString();
		return myString;
	}

}
