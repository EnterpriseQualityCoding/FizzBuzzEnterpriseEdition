package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.EnterpriseGradeFizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.EnterpriseGradeFizzBuzzSolutionStrategy;

public class FizzBuzz {
	public void fizzbuzz(int nFizzBuzzUpperLimit) {
		FizzBuzzSolutionStrategyFactory mySolutionStrategyFactory =
			new EnterpriseGradeFizzBuzzSolutionStrategyFactory();
		FizzBuzzSolutionStrategy mySolutionStrategy =
			mySolutionStrategyFactory.createFizzBuzzSolutionStrategy();
		mySolutionStrategy.runSolution(nFizzBuzzUpperLimit);
	}
}
