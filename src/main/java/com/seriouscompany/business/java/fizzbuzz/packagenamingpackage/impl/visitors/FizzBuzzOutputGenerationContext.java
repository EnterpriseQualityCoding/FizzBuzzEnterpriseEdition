package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.DataPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContext;

import javax.annotation.Nonnull;

public final class FizzBuzzOutputGenerationContext implements OutputGenerationContext {

	@Nonnull
	private final DataPrinter printer;
	@Nonnull
	private final IsEvenlyDivisibleStrategy strategy;

	public FizzBuzzOutputGenerationContext(@Nonnull final IsEvenlyDivisibleStrategy strategy,
										   @Nonnull final DataPrinter printer) {
		super();
		this.strategy = strategy;
		this.printer = printer;
	}

	@Nonnull
	@Override
	public DataPrinter getPrinter() {
		return this.printer;
	}

	@Nonnull
	@Override
	public IsEvenlyDivisibleStrategy getStrategy() {
		return this.strategy;
	}

}
