package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.factories.NoFizzNoBuzzReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class NoFizzNoBuzzIntegerPrinter implements IntegerPrinter {
	
	private IntegerStringReturner myIntegerStringReturner;
	private FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter;

	public NoFizzNoBuzzIntegerPrinter(NoFizzNoBuzzReturnerFactory returnerFactory, FizzBuzzOutputStrategy outputStrategy) {
		myIntegerStringReturner = returnerFactory.createIntegerStringReturner();
		myOutputAdapter = new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(outputStrategy);
	}

	public void printInteger(int theInteger) {
		final String myIntegerString = myIntegerStringReturner.getIntegerReturnString(theInteger); 

		myOutputAdapter.output(myIntegerString);
	}

	@Override
	public void print() {
		throw new UnsupportedOperationException("com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.printers.NoFizzNoBuzzIntegerPrinter.print()");
	}

	@Override
	public void printValue(Object value) {
		printInteger((Integer)value);
	}

}
