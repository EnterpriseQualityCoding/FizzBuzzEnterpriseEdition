package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.data.ResultCollection;

/**
 * Factory for ResultCollection
 */
public interface ResultCollectionFactory<T> {
	public ResultCollection<T> createResultCollection();
}
