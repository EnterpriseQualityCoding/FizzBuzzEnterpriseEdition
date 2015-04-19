package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;

@Service
public class DefaultFizzBuzzUpperLimitParameter implements FizzBuzzUpperLimitParameter {

	public int obtainUpperLimitValue() {
		return DefaultFizzBuzzUpperLimitParameterValue;
	}

	private final int DefaultFizzBuzzUpperLimitParameterValue = 100;
}

