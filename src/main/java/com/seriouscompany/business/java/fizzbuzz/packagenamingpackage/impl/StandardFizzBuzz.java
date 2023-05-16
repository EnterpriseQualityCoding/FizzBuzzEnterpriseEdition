// StandardFizzBuzz.java
// Standard FizzBuzz

// add this specific class (StandardFizzBuzz) to the package named com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

// import package org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Autowired;
// import package org.springframework.stereotype.Service
import org.springframework.stereotype.Service;

// import package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;
// import package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
// import package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

/**
 * Standard FizzBuzz
 */
@Service
public class StandardFizzBuzz implements FizzBuzz {
	// create a private contstant called _fizzBuzzSolutionStrategyFactory of type FizzBuzzSolutionStrategyFactory imported from com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory on line 15
	private final FizzBuzzSolutionStrategyFactory _fizzBuzzSolutionStrategyFactory;

	/**
	 * the constructor for the class StandardFizzBuzz declared on line 23
	 * @param _fizzBuzzSolutionStrategyFactory
	 */
	@Autowired
	public StandardFizzBuzz(final FizzBuzzSolutionStrategyFactory _fizzBuzzSolutionStrategyFactory) {
		// call the constructor of the class StandardFizzBuzz declared on line 13
		super();
		// set the value of the constant _fizzBuzzSolutionStrategyFactory, a property on the current object declared on line 25, to the value of _fizzBuzzSolutionStrategyFactory, the parameter to the constructor of StandardFizzBuzz declared on line 23, declared on line 32
		this._fizzBuzzSolutionStrategyFactory = _fizzBuzzSolutionStrategyFactory;
	}

	/**
	 * the method fizzBuzz on the class StandardFizzBuzz declared on line 23
	 * @param nFizzBuzzUpperLimit
	 */
	public void fizzBuzz(final int nFizzBuzzUpperLimit) {
		// a constant called mySolutionStrategy of type FizzBuzzSolutionStrategy imported from com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy on line 17, which is set to the return value of the method createFizzBuzzSolutionStrategy on the property _fizzBuzzSolutionStrategy of this object declared on line 25
		final FizzBuzzSolutionStrategy mySolutionStrategy =
				this._fizzBuzzSolutionStrategyFactory.createFizzBuzzSolutionStrategy();
		// run the method runSolution on the object mySolutionStrategy declared on lines 45-46 of type FizzBuzzSolutionStrategy and pass in the parameter to this function called nFizzBuzzUpperLimit of type int
		mySolutionStrategy.runSolution(nFizzBuzzUpperLimit);
	}
}
