package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.BuzzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

import javax.annotation.Nonnull;

@Service
public class BuzzStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

	@Nonnull
	private final BuzzStrategy _buzzStrategy;

	@Autowired
	public BuzzStrategyFactory(@Nonnull final BuzzStrategy _buzzStrategy) {
		this._buzzStrategy = _buzzStrategy;
	}

	@Nonnull
	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		return this._buzzStrategy;
	}

}
