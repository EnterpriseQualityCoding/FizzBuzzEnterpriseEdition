package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.factories;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.returners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturnerFactory implements StringStringReturnerFactory {

	private ResourceBundle l10n;

	public FizzStringReturnerFactory(ResourceBundle l10n) {
		this.l10n = l10n;
	}

	@Override
	public StringStringReturner createStringStringReturner() {
		final FizzStringReturner myFizzStringReturner = new FizzStringReturner(l10n);
		return myFizzStringReturner;
	}

}
