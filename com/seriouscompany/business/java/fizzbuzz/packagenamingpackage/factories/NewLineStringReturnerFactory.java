package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.StringStringReturner;

public class NewLineStringReturnerFactory implements
		StringStringReturnerFactory {

	@Override
	public StringStringReturner createStringStringReturner() {
		NewLineStringReturner myNewLineStringReturner = new NewLineStringReturner();
		return myNewLineStringReturner;
	}

}
