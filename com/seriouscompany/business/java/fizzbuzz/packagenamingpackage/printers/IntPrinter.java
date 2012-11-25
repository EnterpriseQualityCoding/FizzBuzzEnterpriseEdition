package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.IntegerStringReturner;

public class IntPrinter {

	public void printInteger(int i) {
		IntegerStringReturner myIntegerIntegerStringReturner = new IntegerIntegerStringReturner();
		String myIntegerString = myIntegerIntegerStringReturner.getIntegerReturnString(i); 
		System.out.print(myIntegerString);
	}

}
