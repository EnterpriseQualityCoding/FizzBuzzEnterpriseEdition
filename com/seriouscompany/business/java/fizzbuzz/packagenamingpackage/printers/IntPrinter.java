package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.IntegerStringReturner;

public class IntPrinter {

	public void printInteger(int i) {
		IntegerStringReturner isr = new IntegerStringReturner();
		String integerString = isr.getIntegerString(i); 
		System.out.print(integerString);
	}

}
