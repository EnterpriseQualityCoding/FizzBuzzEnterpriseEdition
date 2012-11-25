package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringReturner implements StringStringReturner {
	
	public String getReturnString() {
		StringBuilder myStringBuilder = new StringBuilder("\n");
		String myString = myStringBuilder.toString();
		return new String(myString);
	}
}
