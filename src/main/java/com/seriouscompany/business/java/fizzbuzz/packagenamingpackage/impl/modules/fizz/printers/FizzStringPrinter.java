package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.factories.FizzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringPrinter implements StringPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public FizzStringPrinter(FizzBuzzOutputStrategy outputStrategy) {
		this.outputStrategy = outputStrategy;
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
