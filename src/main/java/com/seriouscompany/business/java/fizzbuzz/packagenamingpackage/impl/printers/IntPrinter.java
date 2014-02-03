package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class IntPrinter {

	public void printInteger(int theInteger) {
		final IntegerStringReturner myIntegerIntegerStringReturner = new IntegerIntegerStringReturner();
		final String myIntegerString = myIntegerIntegerStringReturner.getIntegerReturnString(theInteger); 
		System.out.print(myIntegerString);
	}

}
