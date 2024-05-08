package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.generators.StringGenerator;

/**
 * Factory for StringGenerator
 */
public interface StringGeneratorFactory<T> {

	/**
	 * @return
	 */
	public StringGenerator<T> createStringGenerator();

}
