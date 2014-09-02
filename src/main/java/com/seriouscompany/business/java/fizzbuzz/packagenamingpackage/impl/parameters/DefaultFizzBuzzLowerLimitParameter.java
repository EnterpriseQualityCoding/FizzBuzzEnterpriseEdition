package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzLowerLimitParameter;

public class DefaultFizzBuzzLowerLimitParameter implements FizzBuzzLowerLimitParameter {

    @Override
	public int ObtainLowerLimitValue() {
		return DefaultFizzBuzzLowerLimitParameterValue;
	}

	private final int DefaultFizzBuzzLowerLimitParameterValue = 1;
}

