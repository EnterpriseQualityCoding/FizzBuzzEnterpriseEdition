package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringPrinter implements StringPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public BuzzStringPrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
	}

	public void print() {
		final StringStringReturnerFactory myBuzzStringReturnerFactory = new BuzzStringReturnerFactory();
		final StringStringReturner myBuzzStringReturner = myBuzzStringReturnerFactory
				.createStringStringReturner();
		try {
			this.outputStrategy.output(myBuzzStringReturner.getReturnString());
		} catch (Exception e) {
			// We're the enterprise...we don't get exceptions!
		}
	}

	@Override
	public void printValue(Object value) {
		print();
	}
}
