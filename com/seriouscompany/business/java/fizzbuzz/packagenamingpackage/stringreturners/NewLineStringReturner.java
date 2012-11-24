package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners;

public class NewLineStringReturner implements StringStringReturner {
	
	public String getReturnString() {
		StringBuilder myStringBuilder = new StringBuilder("\n");
		String myString = myStringBuilder.toString();
		return new String(myString);
	}
}
