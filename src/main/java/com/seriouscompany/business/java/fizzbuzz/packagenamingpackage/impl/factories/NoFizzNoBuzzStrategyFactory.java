package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.NoFizzNoBuzzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;

import javax.annotation.Nonnull;

@Service
public class NoFizzNoBuzzStrategyFactory implements
		IsEvenlyDivisibleStrategyFactory {

	@Nonnull
	private final NoFizzNoBuzzStrategy _noFizzNoBuzzStrategy;

	@Autowired
	public NoFizzNoBuzzStrategyFactory(@Nonnull final NoFizzNoBuzzStrategy _noFizzNoBuzzStrategy) {
		this._noFizzNoBuzzStrategy = _noFizzNoBuzzStrategy;
	}

	@Nonnull
	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		return this._noFizzNoBuzzStrategy;
	}

}
