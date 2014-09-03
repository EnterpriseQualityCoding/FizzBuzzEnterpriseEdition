package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.factories;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.returners.NoFizzNoBuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class NoFizzNoBuzzReturnerFactory implements
		IntegerStringReturnerFactory {

	private ResourceBundle l10n;

	public NoFizzNoBuzzReturnerFactory(ResourceBundle l10n) {
		this.l10n = l10n;
	}

	@Override
	public IntegerStringReturner createIntegerStringReturner() {
		final NoFizzNoBuzzStringReturner myIntegerIntegerStringReturner = new NoFizzNoBuzzStringReturner(l10n);
		return myIntegerIntegerStringReturner;
	}

}
