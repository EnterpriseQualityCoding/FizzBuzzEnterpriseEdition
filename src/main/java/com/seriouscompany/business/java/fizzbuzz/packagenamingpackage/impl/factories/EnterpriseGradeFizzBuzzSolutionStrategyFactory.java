package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.EnterpriseGradeFizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

public class EnterpriseGradeFizzBuzzSolutionStrategyFactory implements FizzBuzzSolutionStrategyFactory {

	@Override
	public FizzBuzzSolutionStrategy create() {
        final FizzBuzzSolutionStrategy myEnterpriseGradeStrategy =
                new EnterpriseGradeFizzBuzzSolutionStrategy();
        return myEnterpriseGradeStrategy;
	}

}
