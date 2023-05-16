// Main.java
// Main

// add this specific class (Main) to the package named com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

// import package org.springframework.context.ApplicationContext
// import package org.springframework.context.ConfigurableApplicationContext
// import package org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// import package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters.DefaultFizzBuzzUpperLimitParameter
// import package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz
// import package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters.DefaultFizzBuzzUpperLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;

/**
 * Main
 */
public final class Main {

	/**
	 * the main function to the class Main declared in com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl; the starting point to the application
	 * @param args The command line arguments passed in from the command line, which are used to change the end effects of the program if used as a Command Line Interface, or CLI, tool. This is declared as `final`, which is a keyword used in Java to declare any variable as a constant, meaning that it cannot be changed after declaration. This specfic program does not use this argument, as this is just an Enterprise Quality(TM) FizzBuzz program which does not need any arguments passed in on execution, but other projects which are less Enterprise Quality(TM) have used it.
	 */
	public static void main(final String[] args) {
		// create an object off of ClassPathXmlApplicationContent imported from org.springframework.context.support.ClassPathXmlApplicationContent on line 12 called context of type ApplicationContext, passing in Constants.SPRING_XML
		final ApplicationContext context = new ClassPathXmlApplicationContext(Constants.SPRING_XML);
		// create an object called myFizzBuzz of type FizzBuzz by calling method getBean from context declared on line 31 and passing in Contants.STANDARD_FIZZ_BUZZ
		final FizzBuzz myFizzBuzz = (FizzBuzz) context.getBean(Constants.STANDARD_FIZZ_BUZZ);
		// create an object of type FizzBuzzUpperLimitParamater imported from com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter on line 19, using class DefaultFizzBuzzUpperLimit imported from com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters.DefaultFizzBuzzUpperLimitParameter on line 17
		final FizzBuzzUpperLimitParameter fizzBuzzUpperLimit = new DefaultFizzBuzzUpperLimitParameter();
		// call method fizzBuzz on constant myFizzBuzz declared on line 33
		myFizzBuzz.fizzBuzz(fizzBuzzUpperLimit.obtainUpperLimitValue());

		// call method close on context declared on line 31 casted to ConfigurableApplicationContext imported from org.springframework.context.ConfigurableApplicationContect on line 11
		((ConfigurableApplicationContext) context).close();
	}
}
