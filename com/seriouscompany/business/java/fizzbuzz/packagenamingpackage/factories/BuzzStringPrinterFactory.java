package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.BuzzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.StringPrinter;

public class BuzzStringPrinterFactory implements StringPrinterFactory {

	@Override
	public StringPrinter createStringPrinter() {
		StringPrinter myBuzzStringPrinter = new BuzzStringPrinter();
		return myBuzzStringPrinter;
	}

}
