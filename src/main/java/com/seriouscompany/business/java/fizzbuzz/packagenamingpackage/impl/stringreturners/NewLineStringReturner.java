package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class NewLineStringReturner implements StringStringReturner {

	public String getReturnString() {
		final String systemDefaultNewLineString = System.getProperty(
				com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants.LINE_SEPARATOR);
		final StringBuffer myStringBuffer = new StringBuffer(systemDefaultNewLineString);
		final String myString = myStringBuffer.toString();
		return new String(myString);
	}

}
