package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.data.ActionResultCollection;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.data.ResultCollection;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.ResultCollectionFactory;

/**
 * Factory for ActionResultCollection
 */
@Service
public class ActionResultCollectionFactory<T> implements ResultCollectionFactory<T> {
	public BuzzStrategyFactory(final Class<T> resultCollectionType) {
		super();
	}

	@Override
	public ResultCollection<T> createResultCollection() {
		return new ActionResultCollection<>();
	}

}
