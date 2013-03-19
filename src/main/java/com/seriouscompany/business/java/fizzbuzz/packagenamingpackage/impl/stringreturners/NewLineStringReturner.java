package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringReturner implements StringStringReturner {
	
	public String getReturnString() {
		String systemDefaultNewLineString = System.getProperty("line.separator");
		StringBuilder myStringBuilder = new StringBuilder(systemDefaultNewLineString);
		String myString = myStringBuilder.toString();
		return new String(myString);
	}
}
