package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.BuzzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

/**
 * Factory for BuzzStrategy
 */
@Service
public class BuzzStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

	private final BuzzStrategy _buzzStrategy;

	/**
	 * @param _buzzStrategy BuzzStrategy
	 */
	@Autowired
	public BuzzStrategyFactory(final BuzzStrategy _buzzStrategy) {
		super();
		this._buzzStrategy = _buzzStrategy;
	}

	/**
	 * @return void
	 */
	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		return this._buzzStrategy;
	}

}
