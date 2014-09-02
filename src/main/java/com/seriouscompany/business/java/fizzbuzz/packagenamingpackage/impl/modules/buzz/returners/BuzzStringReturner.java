package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.returners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturner implements StringStringReturner {

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder("Buzz");
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
