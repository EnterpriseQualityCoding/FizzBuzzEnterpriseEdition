package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.printers.NoFizzNoBuzzIntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;

public class NoFizzNoBuzzPrinterFactory implements IntegerPrinterFactory {

	@Override
	public IntegerPrinter createPrinter() {
		final NoFizzNoBuzzIntegerPrinter myIntIntegerPrinter = new NoFizzNoBuzzIntegerPrinter();
		return myIntIntegerPrinter;
	}

}
