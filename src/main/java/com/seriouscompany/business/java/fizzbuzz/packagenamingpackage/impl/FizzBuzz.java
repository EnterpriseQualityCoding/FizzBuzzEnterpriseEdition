package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzParameterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.EnterpriseGradeFizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

public class FizzBuzz {
	public void fizzBuzz(final FizzBuzzParameterFactory parameterFactory) {
		final FizzBuzzSolutionStrategyFactory mySolutionStrategyFactory =
			new EnterpriseGradeFizzBuzzSolutionStrategyFactory();
		final FizzBuzzSolutionStrategy mySolutionStrategy =
			mySolutionStrategyFactory.createFizzBuzzSolutionStrategy();
		mySolutionStrategy.runSolution(parameterFactory);
	}
}
