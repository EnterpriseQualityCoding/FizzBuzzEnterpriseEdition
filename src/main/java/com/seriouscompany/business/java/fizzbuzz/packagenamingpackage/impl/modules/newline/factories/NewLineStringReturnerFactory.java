package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.returners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringReturnerFactory implements StringStringReturnerFactory {

	private ResourceBundle l10n;

	public NewLineStringReturnerFactory(ResourceBundle l10n) {
		this.l10n = l10n;
	}

	@Override
	public StringStringReturner createStringStringReturner() {
		final NewLineStringReturner myNewLineStringReturner = new NewLineStringReturner(l10n);
		return myNewLineStringReturner;
	}

}
