package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;

import javax.annotation.Nonnull;

public interface IntegerPrinterFactory {

	@Nonnull
	public IntegerPrinter createPrinter();
	
}
