package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringPrinter implements StringPrinter {
	public void print() {
		final StringStringReturnerFactory myBuzzStringReturnerFactory = new BuzzStringReturnerFactory();
		final StringStringReturner myBuzzStringReturner = myBuzzStringReturnerFactory.createStringStringReturner();
		System.out.print(myBuzzStringReturner.getReturnString());
	}
}
