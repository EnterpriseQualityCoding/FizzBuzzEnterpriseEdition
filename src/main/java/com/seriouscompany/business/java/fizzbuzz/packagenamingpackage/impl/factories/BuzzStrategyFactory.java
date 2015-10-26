package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.BuzzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

@Service
public class BuzzStrategyFactory implements IsEvenlyDivisibleStrategyFactory {
	
	@Autowired
	private BuzzStrategy _buzzStrategy;
	
	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		return _buzzStrategy;
	}

}
