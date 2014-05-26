package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NewLineStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringPrinter implements StringPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public NewLineStringPrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
	}

	@Override
	public void print() {
		final StringStringReturnerFactory myNewLineStringReturnerFactory = new NewLineStringReturnerFactory();
		final StringStringReturner myNewLineStringReturner = myNewLineStringReturnerFactory
				.createStringStringReturner();
		final String myNewLineString = myNewLineStringReturner.getReturnString();
		try {
			this.outputStrategy.output(myNewLineString);
		} catch (Exception e) {
			// We're the enterprise...we don't get exceptions!
		}
	}

}
