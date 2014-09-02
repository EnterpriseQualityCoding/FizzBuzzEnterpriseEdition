package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.returners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturnerFactory implements StringStringReturnerFactory {

	@Override
	public StringStringReturner createStringStringReturner() {
		final FizzStringReturner myFizzStringReturner = new FizzStringReturner();
		return myFizzStringReturner;
	}

}
