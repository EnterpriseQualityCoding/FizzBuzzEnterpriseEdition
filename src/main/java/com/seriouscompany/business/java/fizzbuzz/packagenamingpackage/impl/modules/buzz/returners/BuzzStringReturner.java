package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.returners;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturner implements StringStringReturner {

	private ResourceBundle l10n;

	public BuzzStringReturner(ResourceBundle l10n) {
		this.l10n = l10n;
	}

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder(l10n.getString("buzz"));
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
