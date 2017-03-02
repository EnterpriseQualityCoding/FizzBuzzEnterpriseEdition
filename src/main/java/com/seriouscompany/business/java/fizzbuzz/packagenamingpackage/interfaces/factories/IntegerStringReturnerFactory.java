package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

/**
 * Factory for IntegerStringReturner
 */
public interface IntegerStringReturnerFactory {

	/**
	 * @return
	 */
	public IntegerStringReturner createIntegerStringReturner();

}
