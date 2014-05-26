package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringReturner implements StringStringReturner {
	
	@Override
	public String getReturnString() {
		final String systemDefaultNewLineString = System.getProperty("line.separator");
		final StringBuilder myStringBuilder = new StringBuilder(systemDefaultNewLineString);
		final String myString = myStringBuilder.toString();
		return myString;
	}
}
