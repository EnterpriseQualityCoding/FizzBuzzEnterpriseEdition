package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.NoFizzNoBuzzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;

@Service
public class NoFizzNoBuzzStrategyFactory implements
		IsEvenlyDivisibleStrategyFactory {

	private final NoFizzNoBuzzStrategy _noFizzNoBuzzStrategy;

	@Autowired
	public NoFizzNoBuzzStrategyFactory(final NoFizzNoBuzzStrategy _noFizzNoBuzzStrategy) {
		this._noFizzNoBuzzStrategy = _noFizzNoBuzzStrategy;
	}

	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		return this._noFizzNoBuzzStrategy;
	}

}
