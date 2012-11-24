package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.StringStringReturner;

public class FizzStringReturnerFactory implements StringStringReturnerFactory {

	@Override
	public StringStringReturner createStringStringReturner() {
		FizzStringReturner myFizzStringReturner = new FizzStringReturner();
		return myFizzStringReturner;
	}

}
