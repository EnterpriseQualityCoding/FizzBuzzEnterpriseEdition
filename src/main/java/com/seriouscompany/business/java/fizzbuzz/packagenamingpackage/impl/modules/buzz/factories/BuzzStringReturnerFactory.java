package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.factories;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.returners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturnerFactory implements StringStringReturnerFactory {

	private ResourceBundle l10n;

	public BuzzStringReturnerFactory(ResourceBundle l10n) {
		this.l10n = l10n;
	}

	@Override
	public StringStringReturner createStringStringReturner() {
		final BuzzStringReturner myBuzzStringReturner = new BuzzStringReturner(l10n);
		return myBuzzStringReturner;
	}

}
