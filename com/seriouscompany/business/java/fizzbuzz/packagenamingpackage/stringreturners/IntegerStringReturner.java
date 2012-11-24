package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners;

public class IntegerStringReturner {

	public String getIntegerString(int i) {
		Integer myInteger = new Integer(i);
		StringBuilder myStringBuilder = new StringBuilder(myInteger.toString());
		String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
