package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class IntPrinter {

	public void printInteger(int theInteger) {
		IntegerStringReturner myIntegerIntegerStringReturner = new IntegerIntegerStringReturner();
		String myIntegerString = myIntegerIntegerStringReturner.getIntegerReturnString(theInteger); 
		System.out.print(myIntegerString);
	}

}
