package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class BuzzPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public BuzzPrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
	}

	public void printBuzz() {
		BuzzStringReturner myBuzzStringReturner = new BuzzStringReturner();
		try {
			this.outputStrategy.output(myBuzzStringReturner.getReturnString());
		} catch (Exception e) {
			// We're the enterprise...we don't get exceptions!
		}
	}
}
