package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.IntegerIntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class IntegerIntegerPrinter implements IntegerPrinter {

	public void printInteger(int i) {
		IntegerStringReturnerFactory myIntegerIntegerStringReturnerFactory = new IntegerIntegerStringReturnerFactory();
		IntegerStringReturner myIntegerStringReturner = myIntegerIntegerStringReturnerFactory.createIntegerStringReturner();
		String myIntegerString = myIntegerStringReturner.getIntegerReturnString(i); 
		System.out.print(myIntegerString);
	}

}
