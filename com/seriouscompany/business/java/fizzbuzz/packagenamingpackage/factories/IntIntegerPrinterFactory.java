package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.IntegerIntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.IntegerPrinter;

public class IntIntegerPrinterFactory implements IntegerPrinterFactory {

	@Override
	public IntegerPrinter createPrinter() {
		IntegerIntegerPrinter myIntIntegerPrinter = new IntegerIntegerPrinter();
		return myIntIntegerPrinter;
	}

}
