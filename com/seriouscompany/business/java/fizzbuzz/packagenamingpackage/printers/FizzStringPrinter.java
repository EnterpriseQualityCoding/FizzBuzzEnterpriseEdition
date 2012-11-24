package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories.FizzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.StringStringReturner;

public class FizzStringPrinter implements StringPrinter {

	public void print() {
		StringStringReturnerFactory myFizzStringReturnerFactory = new FizzStringReturnerFactory();
		StringStringReturner myFizzStringReturner = myFizzStringReturnerFactory.createStringStringReturner();
		System.out.print(myFizzStringReturner.getReturnString());
	}

}
