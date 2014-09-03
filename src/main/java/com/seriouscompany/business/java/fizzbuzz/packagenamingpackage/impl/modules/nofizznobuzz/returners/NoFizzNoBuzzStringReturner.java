package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.returners;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class NoFizzNoBuzzStringReturner implements IntegerStringReturner {

	public NoFizzNoBuzzStringReturner(ResourceBundle l10n) {
	}

	public String getIntegerReturnString(int theInteger) {
		final Integer myIntegerToBeConvertedToString = new Integer(theInteger);
		final StringBuilder myStringBuilder = new StringBuilder(myIntegerToBeConvertedToString.toString());
		final String myResultingStringFromIntegerToStringConversion = myStringBuilder.toString();
		return new String(myResultingStringFromIntegerToStringConversion);
	}

}
