// NoFizzNoBuzzStrategy.java
// Strategy for NoFizzNoBuzz

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

// imports org.springframework.stereotype.Service
import org.springframework.stereotype.Service;

// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.NoFizzNoBuzzStrategyConstants
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.NoFizzNoBuzzStrategyConstants;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

/**
 * Strategy for NoFizzNoBuzz
 */
@Service
public class NoFizzNoBuzzStrategy implements IsEvenlyDivisibleStrategy {

	/**
	 * @param theInteger int
	 * @return boolean
	 */
	public boolean isEvenlyDivisible(final int theInteger) {
		// call the method `numberIsMultipleOfAnotherNumber` from `NumberIsMultipleOfAnotherNumberVerifier` and pass argument parameter constant `theInteger` and argument constant `NO_FIZZ_INTEGER_CONSTANT_VALUE` from `NoFizzNoBuzzStrategyConstants`
		if (!NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
				NoFizzNoBuzzStrategyConstants.NO_FIZZ_INTEGER_CONSTANT_VALUE)) {
			// if number is multiple of another number is not true, call the method numberIsMultipleOfAnotherNumber` from `NumberIsMultipleOfAnotherNumberVerifier` and pass argument parameter constant `theInteger` and argument constant `NO_BUZZ_INTEGER_CONSTANT_VALUE` from `NoFizzNoBuzzStrategyConstants`
			if (!NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
					NoFizzNoBuzzStrategyConstants.NO_BUZZ_INTEGER_CONSTANT_VALUE)) {
				// if number is multiple of another number is not true, return true
				return true;
			} else {
				// otherwise, return false
				return false;
			}
		} else if (!NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
				NoFizzNoBuzzStrategyConstants.NO_BUZZ_INTEGER_CONSTANT_VALUE)) {
			// if number is multiple of another number is not not true, call the method numberIsMultipleOfAnotherNumber` from `NumberIsMultipleOfAnotherNumberVerifier` and pass argument parameter constant `theInteger` and argument constant `NO_BUZZ_INTEGER_CONSTANT_VALUE` from `NoFizzNoBuzzStrategyConstants`
			// call the method numberIsMultipleOfAnotherNumber` from `NumberIsMultipleOfAnotherNumberVerifier` and pass argument parameter constant `theInteger` and argument constant `NO_FIZZ_INTEGER_CONSTANT_VALUE` from `NoFizzNoBuzzStrategyConstants`
			if (!NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
					NoFizzNoBuzzStrategyConstants.NO_FIZZ_INTEGER_CONSTANT_VALUE)) {
				// if number is multiple of another number is not true, return true
				return true;
			} else {
				// otherwise, return false
				return false;
			}
		} else {
			// otherwise, return false
			return false;
		}
	}
}
