package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.IntegerStringReturner;

public class IntPrinter {

	public void printInteger(int i) {
		IntegerStringReturner myIntegerStringReturner = new IntegerStringReturner();
		String myIntegerString = myIntegerStringReturner.getIntegerString(i); 
		System.out.print(myIntegerString);
	}

}
