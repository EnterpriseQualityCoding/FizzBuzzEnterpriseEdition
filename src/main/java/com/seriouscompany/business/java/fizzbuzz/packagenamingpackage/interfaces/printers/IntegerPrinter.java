// IntegerPrinter.java
// Printer for Integer

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers;

/**
 * Printer for Integer
 */
public interface IntegerPrinter extends DataPrinter {

	/**
	 * @param theInteger
	 */
	public void printInteger(int theInteger);  // create a method to print integers which returns void and takes an int parameter called `theInteger`

}
