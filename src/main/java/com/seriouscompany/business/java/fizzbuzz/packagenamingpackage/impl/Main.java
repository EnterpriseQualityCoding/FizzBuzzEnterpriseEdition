package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzParameterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzBuzzDefaultParameterFactory;

public class Main {
	public static void main(String[] args) {
		final FizzBuzz myFizzBuzz = new FizzBuzz();
		final FizzBuzzParameterFactory parameterFactory = new FizzBuzzDefaultParameterFactory();
		myFizzBuzz.fizzBuzz(parameterFactory);
	}
}
