package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories.NewLineStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringPrinter implements StringPrinter {

	private StringStringReturner myNewLineStringReturner;
	private FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter;

	public NewLineStringPrinter(NewLineStringReturnerFactory returnerFactory, FizzBuzzOutputStrategy outputStrategy) {
		myNewLineStringReturner = returnerFactory.createStringStringReturner();
		myOutputAdapter = new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(outputStrategy);

	}

	public void print() {
		myOutputAdapter.output(myNewLineStringReturner.getReturnString());
	}

	@Override
	public void printValue(Object value) {
		print();
	}
}
