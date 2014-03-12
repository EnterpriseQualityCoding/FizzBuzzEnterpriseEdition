package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.IntegerIntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;

public class IntIntegerPrinterFactory implements IntegerPrinterFactory {

	@Override
	public IntegerPrinter createPrinter() {
		final IntegerIntegerPrinter myIntIntegerPrinter = new IntegerIntegerPrinter();
		return myIntIntegerPrinter;
	}

}
