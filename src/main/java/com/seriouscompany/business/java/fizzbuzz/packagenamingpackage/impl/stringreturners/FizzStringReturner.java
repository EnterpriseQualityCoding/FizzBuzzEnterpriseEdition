package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class FizzStringReturner implements StringStringReturner {

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder(
				com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants.FIZZ);
		final String myString = myStringBuilder.toString();
		final char[] myCharacters = myString.toCharArray();
		return new String(myCharacters, 0, myCharacters.length);
	}

}
