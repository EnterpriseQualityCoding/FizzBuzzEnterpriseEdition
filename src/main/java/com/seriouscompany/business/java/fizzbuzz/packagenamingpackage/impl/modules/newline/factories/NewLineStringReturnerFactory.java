package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.returners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringReturnerFactory implements StringStringReturnerFactory {

	@Override
	public StringStringReturner createStringStringReturner() {
		final NewLineStringReturner myNewLineStringReturner = new NewLineStringReturner();
		return myNewLineStringReturner;
	}

}
