package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.FizzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

import javax.annotation.Nonnull;

@Service
public class FizzStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

    @Nonnull
    private final FizzStrategy _fizzStrategy;

    @Autowired
    public FizzStrategyFactory(@Nonnull final FizzStrategy _fizzStrategy) {
        this._fizzStrategy = _fizzStrategy;
    }

    @Nonnull
    @Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		return this._fizzStrategy;
	}

}
