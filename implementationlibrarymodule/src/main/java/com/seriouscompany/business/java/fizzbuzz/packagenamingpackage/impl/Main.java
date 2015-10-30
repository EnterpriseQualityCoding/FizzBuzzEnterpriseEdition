package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters.DefaultFizzBuzzUpperLimitParameter;

public final class Main {

	public static void main(final String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		final FizzBuzz myFizzBuzz = (FizzBuzz) context.getBean("standardFizzBuzz");
		final FizzBuzzUpperLimitParameter fizzBuzzUpperLimit = new DefaultFizzBuzzUpperLimitParameter();
		myFizzBuzz.fizzBuzz(fizzBuzzUpperLimit.obtainUpperLimitValue());

		((ConfigurableApplicationContext) context).close();

	}
}
