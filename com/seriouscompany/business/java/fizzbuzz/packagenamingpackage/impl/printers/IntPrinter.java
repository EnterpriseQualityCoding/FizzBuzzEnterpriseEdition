package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class IntPrinter {

	public void printInteger(int i) {
		IntegerStringReturner myIntegerIntegerStringReturner = new IntegerIntegerStringReturner();
		String myIntegerString = myIntegerIntegerStringReturner.getIntegerReturnString(i); 
		System.out.print(myIntegerString);
	}

}
