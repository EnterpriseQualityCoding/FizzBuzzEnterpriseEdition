package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturnerFactory implements StringStringReturnerFactory {

	@Override
	public StringStringReturner createStringStringReturner() {
		FizzStringReturner myFizzStringReturner = new FizzStringReturner();
		return myFizzStringReturner;
	}

}
