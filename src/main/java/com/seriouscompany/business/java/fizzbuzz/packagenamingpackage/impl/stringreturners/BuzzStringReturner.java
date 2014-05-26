package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturner implements StringStringReturner {

	@Override
	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder("Buzz");
		final String myString = myStringBuilder.toString();
		return myString;
	}
	
}
