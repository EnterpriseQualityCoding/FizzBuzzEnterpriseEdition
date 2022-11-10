// StandardFizzBuzz.java
// Standard FizzBuzz

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

// imports org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Autowired;
// imports org.springframework.stereotype.Service
import org.springframework.stereotype.Service;

// com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;
// com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
// com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

/**
 * Standard FizzBuzz
 */
@Service
public class StandardFizzBuzz implements FizzBuzz {
	
	// create a private constant which uses FizzBuzzSolutionStrategyFactory called `_fizzBuzzSolutionStrategyFactory`
	private final FizzBuzzSolutionStrategyFactory _fizzBuzzSolutionStrategyFactory;

	/**
	 * @param _fizzBuzzSolutionStrategyFactory
	 */
	@Autowired
	public StandardFizzBuzz(final FizzBuzzSolutionStrategyFactory _fizzBuzzSolutionStrategyFactory) {
		// create a quick pointer `super` thing to access the accessor from the accessor method of the accessed object
		super();
		// initialize the attribute _fizzBuzzSolutionStrategy using param _fizzBuzzSolutionStrategy
		this._fizzBuzzSolutionStrategyFactory = _fizzBuzzSolutionStrategyFactory;
	}

	/**
	 * @param nFizzBuzzUpperLimit
	 */
	public void fizzBuzz(final int nFizzBuzzUpperLimit) {
		// create a constant which uses FizzBuzzSolutionStrategy called `mySolutionStrategy`
		final FizzBuzzSolutionStrategy mySolutionStrategy =
			// set mySolutionStrategy to the returned value of the method `createFizzBuzzSolutionStrategy` from the class attribute `_fizzBuzzSolutionStrategyFactory`
			this._fizzBuzzSolutionStrategyFactory.createFizzBuzzSolutionStrategy();
		// use the method runSolution with argument of parameter of nFizzBuzzUpperLimit from mySolutionStrategy
		mySolutionStrategy.runSolution(nFizzBuzzUpperLimit);
	}

}
