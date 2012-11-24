package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories.NewLineStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.StringStringReturner;

public class NewLineStringPrinter implements StringPrinter {

	public void print() {
		StringStringReturnerFactory myNewLineStringReturnerFactory = new NewLineStringReturnerFactory();
		StringStringReturner myNewLineStringReturner = myNewLineStringReturnerFactory.createStringStringReturner();
		String myNewLineString = myNewLineStringReturner.getReturnString();
		System.out.print(myNewLineString);
	}
	
}
