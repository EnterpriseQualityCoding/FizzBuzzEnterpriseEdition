// FizzBuzzTest.java
// Tests for FizzBuzz

// import method assertEquals from package org.junit.Assert
import static org.junit.Assert.assertEquals;

// import package java.io.BufferedOutputStream
import java.io.BufferedOutputStream;
// import package java.io.ByteArrayOutputStream
import java.io.ByteArrayOutputStream;
// import package java.io.IOException
import java.io.IOException;
// import package java.io.PrintStream
import java.io.PrintStream;

// import package org.junit.After
import org.junit.After;
// import package org.junit.Before
import org.junit.Before;
// import package org.junit.Test
import org.junit.Test;
// import package org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContext;
// import package org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.ConfigurableApplicationContext;
// import package org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext;

// import package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;

/**
 * Tests for FizzBuzz
 */
public class FizzBuzzTest {
	// create a private property on class FizzBuzzTest declared on line 35 called out of type PrintStream imported from import java.io.PrintStream on line 14
	private PrintStream out;
	// create a private property on class FizzBuzzTest declared on line 35 called fb of type FizzBuzz imported from import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz on line 30
	private FizzBuzz fb;

	/**
	 * setUp method on class FizzBuzzTest declared on line 35 sets up object for tests
	 * @return void
	 */
	@Before
	public void setUp() {
		// declare an object called context of type ApplicationContext imported from org.springframework.context.ApplicationContext on line 23, based on ClassPathXmlApplicationContext imported from org.springframework.context.support.ClassPathXmlApplicationContext on line 27 passing in test constant SPRING_XML
		final ApplicationContext context = new ClassPathXmlApplicationContext(TestConstants.SPRING_XML);
		// set the value of the property fb of the current object declared on line 39 to the return value of the method getBean on the object context of type ApplicationContext declared on line 48 passing in the test constant STANDARD_FIZZ_BUZZ casted to the type FizzBuzz imported from import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz on line 30
		this.fb = (FizzBuzz) context.getBean(TestConstants.STANDARD_FIZZ_BUZZ);
		// set the print stream for this class to System.out, by setting the value of the property out of the current object declared on line 37
		this.out = System.out;
		// call the method close on the object context declared on line 48 casted to type ConfigurableApplicationContext imported from org.springframework.context.ConfigurableApplicationContext on line 25
		((ConfigurableApplicationContext) context).close();
	}

	/**
	 * tearDown method on class FizzBuzzTest declared on line 35 deconstructs object and sets everything back to defaults
	 * @return void
	 */
	@After
	public void tearDown() {
		// set the system output to the value of the property out on the current object, which should be set to System.out due to it being set on line 52 in method setUp of class FizzBuzzTest declared on line 35
		System.setOut(this.out);
	}

	/**
	 * do the fizzbuzz; see method testFizzBuzz on class FizzBuzzTest declared on line 35 declared on line 98
	 * @param n int
	 * @param s String
	 * @throws IOException
	 */
	private void doFizzBuzz(final int n, final String s) throws IOException {
		// create a constant of type ByteArrayOutputStream imported from java.io.ByteArrayOutputStream on line 10 called baos
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		// create a constant of type BufferedOutputStream imported from java.io.BufferedOutputStream on line 8 called bos, and pass in baos declared on line 75 to the constructor
		final BufferedOutputStream bos = new BufferedOutputStream(baos);
		// set the system output to the returned object of the constructor for PrintStream imported from java.io.PrintStream on line 14 passing in bos declared on line 77
		System.setOut(new PrintStream(bos));

		// call the method fizzBuzz on the property fb of the current object, passing in the constant parameter n of type int
		this.fb.fizzBuzz(n);

		// flush the system ouput by running the method flush on the property out on the class System
		System.out.flush();
		// create a string variable called platformDependentExpectedResult which replaces all of the newlines in the constant parameter s of type string with the system line seperator, fetched by passing "line.seperator" to the method getProperty on class System
		String platformDependentExpectedResult = s.replaceAll("\\n", System.getProperty("line.separator"));
		// assert that the value of platformDependentExpectedResult declared on line 87 is equal to the string-casted value of baos declared on line 75
		assertEquals(platformDependentExpectedResult, baos.toString());
	}

	/**
	 * does the fizzbuzz; see method doFizzBuzz on class FizzBuzzTest declared on line 35 declared on line 73
	 * @throws IOException
	 * @return void
	 */
	@Test
	public void testFizzBuzz() throws IOException {
		// run the method doFizzBuzz of the current object, passing in the test constant INT_1 as n and the test constant _1_ as s
		this.doFizzBuzz(TestConstants.INT_1, TestConstants._1_);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_2 as n and the test constant _1_2 as s
		this.doFizzBuzz(TestConstants.INT_2, TestConstants._1_2_);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_3 as n and the test constant _1_2_FIZZ as s
		this.doFizzBuzz(TestConstants.INT_3, TestConstants._1_2_FIZZ);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_4 as n and the test constant _1_2_FIZZ_4 as s
		this.doFizzBuzz(TestConstants.INT_4, TestConstants._1_2_FIZZ_4);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_5 as n and the test constant _1_2_FIZZ_4_BUZZ as s
		this.doFizzBuzz(TestConstants.INT_5, TestConstants._1_2_FIZZ_4_BUZZ);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_6 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ as s
		this.doFizzBuzz(TestConstants.INT_6, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_7 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ_7 as s
		this.doFizzBuzz(TestConstants.INT_7, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_8 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ_7_8 as s
		this.doFizzBuzz(TestConstants.INT_8, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_9 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ as s
		this.doFizzBuzz(TestConstants.INT_9, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_10 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ as s
		this.doFizzBuzz(TestConstants.INT_10, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_11 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11 as s
		this.doFizzBuzz(TestConstants.INT_11, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_12 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ as s
		this.doFizzBuzz(TestConstants.INT_12, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_13 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13 as s
		this.doFizzBuzz(TestConstants.INT_13, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_14 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14 as s
		this.doFizzBuzz(TestConstants.INT_14, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_15 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ as s
		this.doFizzBuzz(TestConstants.INT_15,
				TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ);
		// run the method doFizzBuzz of the current object, passing in the test constant INT_16 as n and the test constant _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16 as s
		this.doFizzBuzz(TestConstants.INT_16,
				TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16);
	}

}
