package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters.DefaultFizzBuzzUpperLimitParameter;

public class Main {
	public static void main(String[] args) {
		final FizzBuzz myFizzBuzz = new FizzBuzz();
		final FizzBuzzUpperLimitParameter fizzBuzzUpperLimit = new DefaultFizzBuzzUpperLimitParameter();
		myFizzBuzz.fizzBuzz(fizzBuzzUpperLimit.obtainUpperLimitValue());
	}
}
