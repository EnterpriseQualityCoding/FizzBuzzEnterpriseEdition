package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.generators.IntegerGenerator;

/**
 * Factory for IntegerGenerator
 */
public interface IntegerGeneratorFactory<T> {

	/**
	 * @return
	 */
	public IntegerGenerator<T> createIntegerGenerator();

}
