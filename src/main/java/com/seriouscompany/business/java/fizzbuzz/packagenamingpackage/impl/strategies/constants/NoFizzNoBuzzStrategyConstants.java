package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants;

import org.springframework.stereotype.Service;

/**
 * Constants for NoFizzNoBuzzStrategy
 */
@Service
public final class NoFizzNoBuzzStrategyConstants {

	private NoFizzNoBuzzStrategyConstants() {}

	public static final int NO_BUZZ_INTEGER_CONSTANT_VALUE = BuzzStrategyConstants.BUZZ_INTEGER_CONSTANT_VALUE;
	public static final int NO_FIZZ_INTEGER_CONSTANT_VALUE = FizzStrategyConstants.FIZZ_INTEGER_CONSTANT_VALUE;

}
