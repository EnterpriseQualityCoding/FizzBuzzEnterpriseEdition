package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners;

public class BuzzStringReturner implements StringStringReturner {

	public String getReturnString() {
		StringBuilder myStringBuilder = new StringBuilder("Buzz");
		String myString = myStringBuilder.toString();
		return new String(myString);
	}
	
}
