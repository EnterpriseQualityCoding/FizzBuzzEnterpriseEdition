package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

@Service
public class EnterpriseGradeFizzBuzzSolutionStrategyFactory implements FizzBuzzSolutionStrategyFactory {

	@Autowired
	private FizzBuzzSolutionStrategy _fizzBuzzSolutionStrategy;
	
	@Override
	public FizzBuzzSolutionStrategy createFizzBuzzSolutionStrategy() {
		return _fizzBuzzSolutionStrategy;
	}

}
