package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.FizzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.StringPrinter;

public class FizzStringPrinterFactory implements StringPrinterFactory {

	@Override
	public StringPrinter createStringPrinter() {
		StringPrinter myFizzStringPrinter = new FizzStringPrinter();
		return myFizzStringPrinter;
	}

}
