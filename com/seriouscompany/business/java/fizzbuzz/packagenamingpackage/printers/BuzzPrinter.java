package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.BuzzStringReturner;

public class BuzzPrinter {
	public void printBuzz() {
		BuzzStringReturner myBuzzStringReturner = new BuzzStringReturner();
		System.out.print(myBuzzStringReturner.getReturnString());
	}
}
