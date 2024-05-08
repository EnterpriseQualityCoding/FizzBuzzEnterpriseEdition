package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.generators.GeneratorList;

/**
 * Factory for GeneratorList
 */
public interface GeneratorListFactory<E, G extends Generator<T>> {

	/**
	 * @return
	 */
	public GeneratorList<E, G> createGeneratorList();

}
