package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class IntPrinter {

	public void printInteger(int i) {
		IntegerStringReturner myIntegerStringReturner = new IntegerStringReturner();
		String myIntegerString = myIntegerStringReturner.getIntegerString(i); 
		System.out.print(myIntegerString);
	}

}
