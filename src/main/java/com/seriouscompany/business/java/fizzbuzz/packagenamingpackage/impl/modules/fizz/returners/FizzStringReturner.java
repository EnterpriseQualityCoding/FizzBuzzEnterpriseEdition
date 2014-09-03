package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.returners;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturner implements StringStringReturner {

	private ResourceBundle l10n;

	public FizzStringReturner(ResourceBundle l10n) {
		this.l10n = l10n;
	}

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder(l10n.getString("fizz"));
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
