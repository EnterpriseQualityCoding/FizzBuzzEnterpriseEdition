package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.generators.GeneratorListGenerator;

/**
 * Factory for GeneratorListGenerator
 */
public interface GeneratorListGeneratorFactory<E, G extends Generator<E>, L extends GeneratorList<E, G>> {

	/**
	 * @return
	 */
	public GeneratorListGenerator<E, G, L> createGeneratorListGenerator();

}
