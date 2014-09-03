package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.returners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringReturner implements StringStringReturner {

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder("\n");
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
