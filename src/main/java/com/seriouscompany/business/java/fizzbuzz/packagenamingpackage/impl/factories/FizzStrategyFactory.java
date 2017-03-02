package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.FizzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

/**
 * Factory for FizzStrategy
 */
@Service
public class FizzStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

	private final FizzStrategy _fizzStrategy;

	/**
	 * @param _fizzStrategy FizzStrategy
	 */
	@Autowired
	public FizzStrategyFactory(final FizzStrategy _fizzStrategy) {
		super();
		this._fizzStrategy = _fizzStrategy;
	}

	/**
	 * @return IsEvenlyDivisibleStrategy
	 */
	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		return this._fizzStrategy;
	}

}
