package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

public class FizzStringPrinter implements StringPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public FizzStringPrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
	}

	public void print() {
		final StringStringReturnerFactory myFizzStringReturnerFactory = new FizzStringReturnerFactory();
		final StringStringReturner myFizzStringReturner = myFizzStringReturnerFactory
				.createStringStringReturner();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(outputStrategy);

		myOutputAdapter.output(myFizzStringReturner.getReturnString());
	}

	@Override
	public void printValue(Object value) {
		print();
	}

}
