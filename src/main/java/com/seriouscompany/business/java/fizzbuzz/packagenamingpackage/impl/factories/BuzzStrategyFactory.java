// BuzzStrategyFactory.java
// Factory for BuzzStrategy

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

// imports org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Autowired;
// imports org.springframework.stereotype.Service
import org.springframework.stereotype.Service;

// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.BuzzStrategy
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.BuzzStrategy;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleFactory
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

/**
 * Factory for BuzzStrategy
 */
@Service
public class BuzzStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

	// create a private constant using BuzzStrategy called `_buzzStrategy` with no value
	private final BuzzStrategy _buzzStrategy;

	/**
	 * @param _buzzStrategy BuzzStrategy
	 */
	@Autowired
	// create constructor
	public BuzzStrategyFactory(final BuzzStrategy _buzzStrategy) {
		// create a quick pointer `super` thing to access the accessor from the accessor method of the accessed object
		super();
		// set the attribute `_buzzStrategy` to the parameter constant `buzzStrategy` of type BuzzStrategy
		this._buzzStrategy = _buzzStrategy;
	}

	/**
	 * @return void
	 */
	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		// return the attribute `_buzzStrategy`
		return this._buzzStrategy;
	}

}
