package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.NewLineStringReturner;

public class NewLinePrinter {

	public void printNewLine() {
		NewLineStringReturner myNewLineStringReturner = new NewLineStringReturner();
		String myNewLineString = myNewLineStringReturner.getReturnString();
		System.out.print(myNewLineString);
	}
	
}
