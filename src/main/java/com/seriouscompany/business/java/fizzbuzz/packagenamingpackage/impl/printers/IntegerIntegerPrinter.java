package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.IntegerIntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

public class IntegerIntegerPrinter implements IntegerPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public IntegerIntegerPrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
	}

	public void printInteger(int theInteger) {
		final IntegerStringReturnerFactory myIntegerIntegerStringReturnerFactory = new IntegerIntegerStringReturnerFactory();
		final IntegerStringReturner myIntegerStringReturner = myIntegerIntegerStringReturnerFactory.createIntegerStringReturner();
		final String myIntegerString = myIntegerStringReturner.getIntegerReturnString(theInteger);
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(outputStrategy);

		myOutputAdapter.output(myIntegerString);
	}

	@Override
	public void print() {
		throw new UnsupportedOperationException("com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.IntegerIntegerPrinter.print()");
	}

	@Override
	public void printValue(Object value) {
		printInteger((Integer)value);
	}

}
