package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.returners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

public class NewLinePrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public NewLinePrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
	}

	public void printBuzz() {
		final NewLineStringReturner myNewLineStringReturner = new NewLineStringReturner();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(outputStrategy);

		myOutputAdapter.output(myNewLineStringReturner.getReturnString());
	}
}
