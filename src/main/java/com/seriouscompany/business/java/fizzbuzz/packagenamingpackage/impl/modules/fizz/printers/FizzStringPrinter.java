package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.factories.FizzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.returners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class FizzStringPrinter implements StringPrinter {

	private FizzStringReturner myFizzStringReturner;
	private FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter;

	public FizzStringPrinter(FizzStringReturnerFactory returnerFactory, FizzBuzzOutputStrategy outputStrategy) {
		myFizzStringReturner = (FizzStringReturner) returnerFactory.createStringStringReturner();
		myOutputAdapter = new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(outputStrategy);
	}

	public void print() {
		myOutputAdapter.output(myFizzStringReturner.getReturnString());
	}

	@Override
	public void printValue(Object value) {
		print();
	}

}
