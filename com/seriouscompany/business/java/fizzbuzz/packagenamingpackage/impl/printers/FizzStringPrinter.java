package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringPrinter implements StringPrinter {

	public void print() {
		StringStringReturnerFactory myFizzStringReturnerFactory = new FizzStringReturnerFactory();
		StringStringReturner myFizzStringReturner = myFizzStringReturnerFactory.createStringStringReturner();
		System.out.print(myFizzStringReturner.getReturnString());
	}

}
