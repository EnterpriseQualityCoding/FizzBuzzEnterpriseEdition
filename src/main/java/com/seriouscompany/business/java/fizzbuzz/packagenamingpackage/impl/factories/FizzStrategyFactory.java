package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.FizzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

@Service
public class FizzStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

	private final FizzStrategy _fizzStrategy;

    @Autowired
    public FizzStrategyFactory(final FizzStrategy _fizzStrategy) {
		super();
		this._fizzStrategy = _fizzStrategy;
	}

    @Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		return this._fizzStrategy;
	}

}
