package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.FizzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

public class FizzStringPrinterFactory implements StringPrinterFactory {

	@Override
	public StringPrinter createStringPrinter() {
		StringPrinter myFizzStringPrinter = new FizzStringPrinter();
		return myFizzStringPrinter;
	}

}
