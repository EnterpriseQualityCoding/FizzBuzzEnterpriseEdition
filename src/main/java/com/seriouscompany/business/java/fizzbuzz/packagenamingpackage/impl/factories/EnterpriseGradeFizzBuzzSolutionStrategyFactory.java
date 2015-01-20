package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.EnterpriseGradeFizzBuzzSolutionStrategy;

public class EnterpriseGradeFizzBuzzSolutionStrategyFactory implements FizzBuzzSolutionStrategyFactory {

	@Override
	public FizzBuzzSolutionStrategy createFizzBuzzSolutionStrategy() {
		final FizzBuzzSolutionStrategy myEnterpriseGradeStrategy =
			new EnterpriseGradeFizzBuzzSolutionStrategy();
			
		return myEnterpriseGradeStrategy;
	}

}
