package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * Returner for FizzString
 */
@Service
public class FizzStringReturner implements StringStringReturner {

	/**
	 * @return String
	 */
	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder(
				com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants.FIZZ);
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
