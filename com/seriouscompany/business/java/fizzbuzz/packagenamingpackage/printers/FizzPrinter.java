package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.FizzStringReturner;

public class FizzPrinter {

	public void printFizz() {
		FizzStringReturner fsr = new FizzStringReturner();
		System.out.print(fsr.getFizz());
	}

}
