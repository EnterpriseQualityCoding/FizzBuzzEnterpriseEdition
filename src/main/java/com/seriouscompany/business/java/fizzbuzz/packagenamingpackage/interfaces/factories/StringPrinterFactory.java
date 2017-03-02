package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

/**
 * Factory for StringPrinter
 */
public interface StringPrinterFactory {

	/**
	 * @return
	 */
	public StringPrinter createStringPrinter();

}
