package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners;

public class NewLineStringReturner {
	
	public String getNewLineString() {
		StringBuilder myStringBuilder = new StringBuilder("\n");
		String myString = myStringBuilder.toString();
		return new String(myString);
	}
}
