package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.caching.LazilyComputedValue;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LazyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.NoFizzNoBuzzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Strategy for NoFizzNoBuzz
 */
@Service
public class NoFizzNoBuzzStrategy implements IsEvenlyDivisibleStrategy {

	private final LazyFactory lazyFactory;

	@Autowired
	public NoFizzNoBuzzStrategy(LazyFactory lazyFactory) {
		this.lazyFactory = lazyFactory;
	}

	/**
	 * @param theInteger int
	 * @return boolean
	 */
	public boolean isEvenlyDivisible(final int theInteger) {
		LazilyComputedValue<Boolean> lazilyComputedIsFizzMultiple = this.lazyFactory.createLazy(
				() -> NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
						NoFizzNoBuzzStrategyConstants.NO_FIZZ_INTEGER_CONSTANT_VALUE));
		LazilyComputedValue<Boolean> lazilyComputedIsBuzzMultiple = this.lazyFactory.createLazy(
				() -> NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
						NoFizzNoBuzzStrategyConstants.NO_BUZZ_INTEGER_CONSTANT_VALUE));
		if (!lazilyComputedIsFizzMultiple.getLazilyComputedValue()) {
			if (!lazilyComputedIsBuzzMultiple.getLazilyComputedValue()) {
				return true;
			} else {
				return false;
			}
		} else if (!lazilyComputedIsBuzzMultiple.getLazilyComputedValue()) {
			if (!lazilyComputedIsFizzMultiple.getLazilyComputedValue()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
