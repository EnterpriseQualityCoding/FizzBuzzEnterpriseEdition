package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners.BuzzStringReturner;

public class BuzzPrinter {
	public void printBuzz() {
		BuzzStringReturner bsr = new BuzzStringReturner();
		System.out.print(bsr.getBuzz());
	}
}
