package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.NewLineStringReturner;

public class NewLinePrinter {

	public void printNewLine() {
		NewLineStringReturner nlsr = new NewLineStringReturner();
		String newLineString = nlsr.getNewLineString();
		System.out.print(newLineString);
	}
	
}
