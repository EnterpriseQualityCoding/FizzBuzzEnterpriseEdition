package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class BuzzStringReturner implements StringStringReturner {

	public String getReturnString() {
		final StringBuffer myStringBuffer = new StringBuffer(
				com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants.BUZZ);
		final String myString = myStringBuffer.toString();
		return new String(myString);
	}

}
