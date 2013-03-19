package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class IntegerIntegerStringReturnerFactory implements
		IntegerStringReturnerFactory {

	@Override
	public IntegerStringReturner createIntegerStringReturner() {
		IntegerIntegerStringReturner myIntegerIntegerStringReturner = new IntegerIntegerStringReturner();
		return myIntegerIntegerStringReturner;
	}

}
