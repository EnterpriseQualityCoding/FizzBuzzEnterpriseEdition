package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringReturnerFactory implements
		StringStringReturnerFactory {

	@Override
	public StringStringReturner createStringStringReturner() {
		StringStringReturner myNewLineStringReturner = new NewLineStringReturner();
		return myNewLineStringReturner;
	}

}
