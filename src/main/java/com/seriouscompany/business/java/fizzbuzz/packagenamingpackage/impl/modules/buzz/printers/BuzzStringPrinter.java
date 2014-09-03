package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.returners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class BuzzStringPrinter implements StringPrinter {

	private BuzzStringReturner myBuzzStringReturner;
	private FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter;

	public BuzzStringPrinter(StringStringReturnerFactory returnerFactory, FizzBuzzOutputStrategy outputStrategy) {
		myBuzzStringReturner = (BuzzStringReturner) returnerFactory.createStringStringReturner();
		myOutputAdapter = new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(outputStrategy);

	}

	public void print() {
		myOutputAdapter.output(myBuzzStringReturner.getReturnString());
	}

	@Override
	public void printValue(Object value) {
		print();
	}
}
