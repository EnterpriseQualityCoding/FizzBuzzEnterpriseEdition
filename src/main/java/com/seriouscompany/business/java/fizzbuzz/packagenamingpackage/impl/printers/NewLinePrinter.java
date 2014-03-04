package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class NewLinePrinter {
	
	private final FizzBuzzOutputStrategy outputStrategy;
	
	public NewLinePrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
	}

	public void printNewLine() {
		NewLineStringReturner myNewLineStringReturner = new NewLineStringReturner();
		String myNewLineString = myNewLineStringReturner.getReturnString();
		try {
			this.outputStrategy.output(myNewLineString);
		} catch (Exception e) {
			// We're the enterprise...we don't get exceptions!
		}
	}
	
}
