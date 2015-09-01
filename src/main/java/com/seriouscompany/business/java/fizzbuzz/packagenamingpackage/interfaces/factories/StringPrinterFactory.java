package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

import javax.annotation.Nonnull;

public interface StringPrinterFactory {

	@Nonnull
	public StringPrinter createStringPrinter();
	
}
