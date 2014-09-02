package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.returners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturnerFactory implements StringStringReturnerFactory {

	@Override
	public StringStringReturner createStringStringReturner() {
		final BuzzStringReturner myBuzzStringReturner = new BuzzStringReturner();
		return myBuzzStringReturner;
	}

}
