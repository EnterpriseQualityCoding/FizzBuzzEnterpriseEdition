// EnterpriseGradeFizzBuzzSolutionStrategyFactory
// Factory for EnterpriseGradeFizzBuzzSolutionStrategy

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

// imports org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Autowired;
// imports the Service class from the steretype package from the springframework package from the org package
import org.springframework.stereotype.Service;

// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionFactory
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

/**
 * Factory for EnterpriseGradeFizzBuzzSolutionStrategy
 */
@Service
public class EnterpriseGradeFizzBuzzSolutionStrategyFactory implements FizzBuzzSolutionStrategyFactory {

	// create a private constant which uses `FizzBuzzSolutionStrategy` called `_fizzBuzzSolutionStrategy`
	private final FizzBuzzSolutionStrategy _fizzBuzzSolutionStrategy;

	/**
	 * @param _fizzBuzzSolutionStrategy FizzBuzzSolutionStrategy
	 */
	@Autowired
	// create a constructor which take a constant parameter called `_fizzBuzzSolutionStrategy` of type FizzBuzzSolutionStrategy
	public EnterpriseGradeFizzBuzzSolutionStrategyFactory(final FizzBuzzSolutionStrategy _fizzBuzzSolutionStrategy) {
		// create a quick pointer `super` thing to access the accessor from the accessor method of the accessed object
		super();
		// set attribute `_fizzBuzzSolutionStrategy` to argument parameter constant `_fizzBuzzSolutionStrategy`
		this._fizzBuzzSolutionStrategy = _fizzBuzzSolutionStrategy;
	}

	/**
	 * @return FizzBuzzSolutionStrategy
	 */
	@Override
	public FizzBuzzSolutionStrategy createFizzBuzzSolutionStrategy() {
		// return attribute `_fizzBuzzSolutionStrategy`
		return this._fizzBuzzSolutionStrategy;
	}

}
