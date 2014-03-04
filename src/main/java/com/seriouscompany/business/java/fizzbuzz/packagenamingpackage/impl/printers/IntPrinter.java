package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class IntPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public IntPrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
	}

	public void printInteger(int theInteger) {
		IntegerStringReturner myIntegerIntegerStringReturner = new IntegerIntegerStringReturner();
		String myIntegerString = myIntegerIntegerStringReturner
				.getIntegerReturnString(theInteger);
		try {
			this.outputStrategy.output(myIntegerString);
		} catch (Exception e) {
			// We're the enterprise...we don't get exceptions!
		}
	}

}
