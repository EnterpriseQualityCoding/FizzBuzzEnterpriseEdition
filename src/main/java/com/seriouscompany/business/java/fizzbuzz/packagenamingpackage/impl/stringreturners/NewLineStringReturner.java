package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * Returner for NewLineString
 */
@Service
public class NewLineStringReturner implements StringStringReturner {

	/**
	 * @return
	 */
	public String getReturnString() {
		final String systemDefaultNewLineString = System.getProperty(
				com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants.LINE_SEPARATOR);
		final StringBuilder myStringBuilder = new StringBuilder(systemDefaultNewLineString);
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
