package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.returners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturner implements StringStringReturner {

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder("Fizz");
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
