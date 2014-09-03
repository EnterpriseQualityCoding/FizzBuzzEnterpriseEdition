package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.printers.FizzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class FizzStringPrinterFactory implements StringPrinterFactory {

	@Override
	public StringPrinter createPrinter(FizzBuzzOutputStrategy outputStrategy) {
		final StringPrinter myFizzStringPrinter = new FizzStringPrinter(outputStrategy);
		return myFizzStringPrinter;
	}

}
