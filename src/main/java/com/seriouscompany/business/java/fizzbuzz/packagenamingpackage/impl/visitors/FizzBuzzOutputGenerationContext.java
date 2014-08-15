package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.DataPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContext;

public class FizzBuzzOutputGenerationContext implements OutputGenerationContext {

	private final DataPrinter printer;
	private final IsEvenlyDivisibleStrategy strategy;

	public FizzBuzzOutputGenerationContext(final IsEvenlyDivisibleStrategy strategy,
			final DataPrinter printer) {
		super();
		this.strategy = strategy;
		this.printer = printer;
	}

	@Override
	public DataPrinter getPrinter() {
		return printer;
	}

	@Override
	public IsEvenlyDivisibleStrategy getStrategy() {
		return strategy;
	}

}
