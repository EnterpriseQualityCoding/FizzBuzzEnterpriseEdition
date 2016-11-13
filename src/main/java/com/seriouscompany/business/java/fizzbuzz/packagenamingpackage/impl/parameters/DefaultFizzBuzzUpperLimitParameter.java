package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;

public final class DefaultFizzBuzzUpperLimitParameter implements FizzBuzzUpperLimitParameter {

	private final int fizzBuzzUpperLimitParameterValue;

	/**
	 * @return
	 */
	public DefaultFizzBuzzUpperLimitParameter() {
		super();
		this.fizzBuzzUpperLimitParameterValue = Constants.DEFAULT_FIZZ_BUZZ_UPPER_LIMIT_PARAMETER_VALUE;
	}

	/**
	 * @param fizzBuzzUpperLimitParameterValue
	 * @return
     */
	public DefaultFizzBuzzUpperLimitParameter(final int fizzBuzzUpperLimitParameterValue) {
		super();
		this.fizzBuzzUpperLimitParameterValue = fizzBuzzUpperLimitParameterValue;
	}

	/**
	 * @return
     */
	public int obtainUpperLimitValue() {
		return this.fizzBuzzUpperLimitParameterValue;
	}

}
