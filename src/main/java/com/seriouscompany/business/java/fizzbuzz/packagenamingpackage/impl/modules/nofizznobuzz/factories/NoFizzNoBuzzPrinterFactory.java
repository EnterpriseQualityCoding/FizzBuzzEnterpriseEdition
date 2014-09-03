package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.printers.NoFizzNoBuzzIntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class NoFizzNoBuzzPrinterFactory implements IntegerPrinterFactory {

	@Override
	public IntegerPrinter createPrinter(FizzBuzzOutputStrategy outputStrategy) {
		final NoFizzNoBuzzIntegerPrinter myIntIntegerPrinter = new NoFizzNoBuzzIntegerPrinter(outputStrategy);
		return myIntIntegerPrinter;
	}

}
