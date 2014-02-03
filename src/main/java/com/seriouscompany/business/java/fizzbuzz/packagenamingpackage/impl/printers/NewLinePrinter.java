package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;

public class NewLinePrinter {

	public void printNewLine() {
		final NewLineStringReturner myNewLineStringReturner = new NewLineStringReturner();
		final String myNewLineString = myNewLineStringReturner.getReturnString();
		System.out.print(myNewLineString);
	}
	
}
