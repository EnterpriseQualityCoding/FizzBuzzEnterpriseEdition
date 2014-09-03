package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.factories.BuzzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringPrinter implements StringPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public BuzzStringPrinter(FizzBuzzOutputStrategy outputStrategy) {
		this.outputStrategy = outputStrategy;
	}

	public void print() {
		final StringStringReturnerFactory myBuzzStringReturnerFactory = new BuzzStringReturnerFactory();
		final StringStringReturner myBuzzStringReturner = myBuzzStringReturnerFactory
				.createStringStringReturner();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(outputStrategy);

		myOutputAdapter.output(myBuzzStringReturner.getReturnString());
	}

	@Override
	public void printValue(Object value) {
		print();
	}
}
