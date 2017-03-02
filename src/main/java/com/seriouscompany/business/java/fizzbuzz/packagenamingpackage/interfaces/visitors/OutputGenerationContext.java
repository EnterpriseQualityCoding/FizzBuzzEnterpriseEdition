package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.DataPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

/**
 * Context for OutputGeneration
 */
public interface OutputGenerationContext {

	/**
	 * @return
	 */
	public IsEvenlyDivisibleStrategy getStrategy();

	/**
	 * @return
	 */
	public DataPrinter getPrinter();

}
