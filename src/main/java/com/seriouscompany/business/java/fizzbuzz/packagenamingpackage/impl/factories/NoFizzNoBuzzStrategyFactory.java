// NoFizzNoBuzzStrategyFactory.java
// Factory for NoFizzNoBuzzStrategy

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

// imports org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Autowired;
// imports org.springframework.stereotype.Service
import org.springframework.stereotype.Service;

// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.NoFizzNoBuzzStrategy
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.NoFizzNoBuzzStrategy;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

/**
 * Factory for NoFizzNoBuzzStrategy
 */
@Service
public class NoFizzNoBuzzStrategyFactory implements
		IsEvenlyDivisibleStrategyFactory {
	
	// creates private constant called `_noFizzNoBuzzStrategy` which uses `NoFizzNoBuzzStrategy`
	private final NoFizzNoBuzzStrategy _noFizzNoBuzzStrategy;

	/**
	 * @param _noFizzNoBuzzStrategy NoFizzNoBuzzStrategy
	 */
	@Autowired
	public NoFizzNoBuzzStrategyFactory(final NoFizzNoBuzzStrategy _noFizzNoBuzzStrategy) {
		// create a quick pointer `super` thing to access the accessor from the accessor method of the accessed object
		super();
		// set attribute `_noFizzNoBuzzStrategy` to constant paraneter `_noFizzNozBuzzStrategy`
		this._noFizzNoBuzzStrategy = _noFizzNoBuzzStrategy;
	}

	/**
	 * @return IsEvenlyDivisibleStrategy
	 */
	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		// return the attribute `_noFizzNoBuzzStrategy`
		return this._noFizzNoBuzzStrategy;
	}

}
