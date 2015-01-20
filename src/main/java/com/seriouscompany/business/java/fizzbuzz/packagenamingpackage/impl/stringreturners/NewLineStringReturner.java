package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringReturner implements StringStringReturner {

	public static final String LINE_SEPARATOR_STRING_VALUE = "line" + "." + "separator";
	
	public String getReturnString() {
		final String systemDefaultNewLineString = System.getProperty(SEPARATOR_STRING_VALUE);
		final StringBuilder myStringBuilder = new StringBuilder(systemDefaultNewLineString);
		final String myString = myStringBuilder.toString();
		return new String(myString);

	}

}
