package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.IntegerStringReturner;

public class IntegerIntegerStringReturnerFactory implements
		IntegerStringReturnerFactory {

	@Override
	public IntegerStringReturner createIntegerStringReturner() {
		IntegerIntegerStringReturner myIntegerIntegerStringReturner = new IntegerIntegerStringReturner();
		return myIntegerIntegerStringReturner;
	}

}
