// Main.java
// Main

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

// imports org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContext;
// imports org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.ConfigurableApplicationContext;
// imports org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext;

// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters.DefaultFizzBuzzUpperLimitParameter
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters.DefaultFizzBuzzUpperLimitParameter;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;

/**
 * Main
 */
public final class Main {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// create a constant for the ApplicationContext called `context` that uses constant `SPRING_XML` from Constants
		final ApplicationContext context = new ClassPathXmlApplicationContext(Constants.SPRING_XML);
		// creates a constant using FizzBuzz called `myFizzBuzz` which accesses the constant `STANDARD_FIZZ_BUZZ` from Constants
		final FizzBuzz myFizzBuzz = (FizzBuzz) context.getBean(Constants.STANDARD_FIZZ_BUZZ);
		// create a constant for the FizzBuzz Upper Limit using FizzBuzzUpperLimitParameter called `fizzBuzzUpperLimit`
		final FizzBuzzUpperLimitParameter fizzBuzzUpperLimit = new DefaultFizzBuzzUpperLimitParameter();
		// set myFizzBuzz.fizzBuzz to the FizzBuzz Upper Limit by using the obtainUpperLimitValue method from fizzBuzz UpperLimit
		myFizzBuzz.fizzBuzz(fizzBuzzUpperLimit.obtainUpperLimitValue());

		// close application context
		((ConfigurableApplicationContext) context).close();

	}

}
