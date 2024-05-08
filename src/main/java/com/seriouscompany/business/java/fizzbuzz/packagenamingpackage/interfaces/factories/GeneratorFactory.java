package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.generators.Generator;

/**
 * Factory for Generator
 */
public interface GeneratorFactory<T> {

	/**
	 * @return
	 */
	public Generator<T> createGenerator();

}
