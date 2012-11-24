package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories.BuzzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.StringStringReturner;

public class BuzzStringPrinter implements StringPrinter {
	public void print() {
		StringStringReturnerFactory myBuzzStringReturnerFactory = new BuzzStringReturnerFactory();
		StringStringReturner myBuzzStringReturner = myBuzzStringReturnerFactory.createStringStringReturner();
		System.out.print(myBuzzStringReturner.getReturnString());
	}
}
