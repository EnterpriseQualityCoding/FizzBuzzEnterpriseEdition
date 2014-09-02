package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzStepParameter;

public class DefaultFizzBuzzStepParameter implements FizzBuzzStepParameter {

    @Override
	public int ObtainStepValue() {
		return DefaultFizzBuzzStepParameterValue;
	}

	private final int DefaultFizzBuzzStepParameterValue = 1;
}

