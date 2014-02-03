package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NewLineStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringPrinter implements StringPrinter {

	public void print() {
		final StringStringReturnerFactory myNewLineStringReturnerFactory = new NewLineStringReturnerFactory();
		final StringStringReturner myNewLineStringReturner = myNewLineStringReturnerFactory.createStringStringReturner();
		final String myNewLineString = myNewLineStringReturner.getReturnString();
		System.out.print(myNewLineString);
	}
	
}
