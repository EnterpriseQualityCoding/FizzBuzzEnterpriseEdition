package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.printers.BuzzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class BuzzStringPrinterFactory implements StringPrinterFactory {
	private final BuzzStringReturnerFactory returnerFactory;

	public BuzzStringPrinterFactory(BuzzStringReturnerFactory returnerFactory) {
		this.returnerFactory = returnerFactory;
	}
	
	@Override
	public StringPrinter createPrinter(FizzBuzzOutputStrategy outputStrategy) {
		final StringPrinter myBuzzStringPrinter = new BuzzStringPrinter(returnerFactory, outputStrategy);
		return myBuzzStringPrinter;
	}

}
