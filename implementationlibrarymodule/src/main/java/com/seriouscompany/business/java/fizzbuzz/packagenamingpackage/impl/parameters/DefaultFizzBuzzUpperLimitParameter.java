package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;

public final class DefaultFizzBuzzUpperLimitParameter implements FizzBuzzUpperLimitParameter {

	public static final int DEFAULT_FIZZ_BUZZ_UPPER_LIMIT_PARAMETER_VALUE = 100;

	private final int fizzBuzzUpperLimitParameterValue;

	public DefaultFizzBuzzUpperLimitParameter() {
		this.fizzBuzzUpperLimitParameterValue = DefaultFizzBuzzUpperLimitParameter.DEFAULT_FIZZ_BUZZ_UPPER_LIMIT_PARAMETER_VALUE;
	}

	public DefaultFizzBuzzUpperLimitParameter(final int fizzBuzzUpperLimitParameterValue) {
		this.fizzBuzzUpperLimitParameterValue = fizzBuzzUpperLimitParameterValue;
	}

	public int obtainUpperLimitValue() {
		return this.fizzBuzzUpperLimitParameterValue;
	}

}
