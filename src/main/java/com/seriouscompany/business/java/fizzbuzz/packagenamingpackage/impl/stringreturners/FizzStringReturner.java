package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class FizzStringReturner implements StringStringReturner {

	public String getReturnString() {
		final StringBuffer myStringBuffer = new StringBuffer(
				com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants.FIZZ);
		final String myString = myStringBuffer.toString();
		final char[] myCharacters = myString.toCharArray();
		return new String(myCharacters, 0, myCharacters.length);
	}

}
