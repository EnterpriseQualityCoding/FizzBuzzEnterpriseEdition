package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;

public class DefaultFizzBuzzUpperLimitParameter implements FizzBuzzUpperLimitParameter {

	public int ObtainUpperLimitValue() {
		return defaultFizzBuzzUpperLimitParameterValue;
	}

	private final int defaultFizzBuzzUpperLimitParameterValue = 100;
}

