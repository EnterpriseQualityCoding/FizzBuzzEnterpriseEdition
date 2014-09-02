package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;

public class DefaultFizzBuzzUpperLimitParameter implements FizzBuzzUpperLimitParameter {

    @Override
	public int ObtainUpperLimitValue() {
		return DefaultFizzBuzzUpperLimitParameterValue;
	}

	private final int DefaultFizzBuzzUpperLimitParameterValue = 100;
}

