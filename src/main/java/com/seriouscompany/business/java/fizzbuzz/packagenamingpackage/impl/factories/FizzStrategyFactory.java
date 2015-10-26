package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.FizzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

@Service
public class FizzStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

	@Autowired
	private FizzStrategy _fizzStrategy;
	
	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		return _fizzStrategy;
	}

}
