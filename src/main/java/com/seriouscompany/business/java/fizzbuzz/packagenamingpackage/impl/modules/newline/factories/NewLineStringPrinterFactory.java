package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.printers.NewLineStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class NewLineStringPrinterFactory implements StringPrinterFactory {
	
	private final NewLineStringReturnerFactory returnerFactory;

	public NewLineStringPrinterFactory(NewLineStringReturnerFactory returnerFactory) {
		this.returnerFactory = returnerFactory;
	}
	
	@Override
	public StringPrinter createPrinter(FizzBuzzOutputStrategy outputStrategy) {
		final StringPrinter myNewLineStringPrinter = new NewLineStringPrinter(returnerFactory, outputStrategy);
		return myNewLineStringPrinter;
	}

}
