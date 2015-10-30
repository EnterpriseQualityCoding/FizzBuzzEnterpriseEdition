package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class FizzStringReturner implements StringStringReturner {

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder("Fizz");
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
