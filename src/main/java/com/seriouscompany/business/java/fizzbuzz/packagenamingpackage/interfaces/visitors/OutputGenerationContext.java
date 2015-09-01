package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.DataPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

import javax.annotation.Nonnull;

public interface OutputGenerationContext {
	@Nonnull
	public IsEvenlyDivisibleStrategy getStrategy();
	@Nonnull
	public DataPrinter getPrinter();
}

