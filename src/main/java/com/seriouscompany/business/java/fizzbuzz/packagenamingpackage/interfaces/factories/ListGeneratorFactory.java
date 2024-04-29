package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.generators.ListGenerator;

/**
 * Factory for ListGenerator
 */
public interface ListGeneratorFactory<E, L extends List<E>> {

	/**
	 * @return
	 */
	public ListGenerator<E, L> createListGenerator();

}
