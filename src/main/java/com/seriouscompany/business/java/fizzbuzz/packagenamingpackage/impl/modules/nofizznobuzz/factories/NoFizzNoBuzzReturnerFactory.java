package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.returners.NoFizzNoBuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class NoFizzNoBuzzReturnerFactory implements
		IntegerStringReturnerFactory {

	@Override
	public IntegerStringReturner createIntegerStringReturner() {
		final NoFizzNoBuzzStringReturner myIntegerIntegerStringReturner = new NoFizzNoBuzzStringReturner();
		return myIntegerIntegerStringReturner;
	}

}
