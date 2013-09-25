package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.EnterpriseGradeFizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

public class FizzBuzz {
    private FizzBuzzSolutionStrategyFactory mySolutionStrategyFactory;

    public FizzBuzz() {
        mySolutionStrategyFactory = new EnterpriseGradeFizzBuzzSolutionStrategyFactory();
    }

    /**
     * Method to allow a FizzBuzz to change the strategy factory it's using.
     *
     * @param factory the new factory
     * @return the old factory
     */
    public FizzBuzzSolutionStrategyFactory injectStrategyFactory(FizzBuzzSolutionStrategyFactory factory) {
        FizzBuzzSolutionStrategyFactory oldFactory = mySolutionStrategyFactory;
        mySolutionStrategyFactory = factory;
        return oldFactory;
    }

	public void fizzbuzz(int nFizzBuzzUpperLimit) {
		FizzBuzzSolutionStrategy mySolutionStrategy =
			mySolutionStrategyFactory.createFizzBuzzSolutionStrategy();
		mySolutionStrategy.runSolution(nFizzBuzzUpperLimit);
	}
}
