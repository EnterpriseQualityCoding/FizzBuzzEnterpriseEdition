// FizzBuzzTest.java
// Tests for FizzBuzz

// imports org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals;

// imports java.io.BufferedOutputStream
import java.io.BufferedOutputStream;
// imports java.io.ByteArrayOutputStream
import java.io.ByteArrayOutputStream;
// imports java.io.IOException
import java.io.IOException;
// imports java.io.PrintStream
import java.io.PrintStream;

// imports org.junit.After
import org.junit.After;
// imports org.junit.Before
import org.junit.Before;
// imports org.junit.Test
import org.junit.Test;
// imports org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContext;
// imports org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.ConfigurableApplicationContext;
// imports org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext;

// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;

/**
 * Tests for FizzBuzz
 */
public class FizzBuzzTest {

	// create a PrintStream called `out`
	private PrintStream out;
	// create a FizBuzz objecct called `fb`
	private FizzBuzz fb;

	/**
	 * @return void
	 */
	@Before
	public void setUp() {
		// create a constant for the ApplicationContext called `context` that uses test constant `SPRING_XML` from TestConstants
		final ApplicationContext context = new ClassPathXmlApplicationContext(TestConstants.SPRING_XML);
		// <...>
		this.fb = (FizzBuzz) context.getBean(TestConstants.STANDARD_FIZZ_BUZZ);
		// set attribute `out` to instance of `PrintStream` type in package `System` called `System.out`
		this.out = System.out;
		// close application context
		((ConfigurableApplicationContext) context).close();
	}

	/**
	 * @return void
	 */
	@After
	public void tearDown() {
		// set the output stream to attribute `out`
		System.setOut(this.out);
	}

	/**
	 * @param n int
	 * @param s String
	 * @throws IOException
	 */
	private void doFizzBuzz(final int n, final String s) throws IOException {
		// create a constant called `baos` using `ByteArrayOutputStream`
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		// create a constant called `bos` using `BufferedOutputStream` and pass argument `baos`
		final BufferedOutputStream bos = new BufferedOutputStream(baos);
		// set the output stream to `bos`
		System.setOut(new PrintStream(bos));

		// call the method `fizzBuzz` from the attribute `fb` and pass argument parameter constant `n`
		this.fb.fizzBuzz(n);

		// flush the output stream
		System.out.flush();
		// create a string called `platformDependentExpectedResult` which takes parameter constant `s` and replaces all newlines with the proper system line seperator by getting property "line.seperator" from the `System` class from the package `java.util`
		String platformDependentExpectedResult = s.replaceAll("\\n", System.getProperty("line.separator"));
		// assert if string `platformDependentExpectedResult` is an equal to `baos` as type string
		assertEquals(platformDependentExpectedResult, baos.toString());
	}

	/**
	 * @throws IOException
	 * @return void
	 */
	@Test
	public void testFizzBuzz() throws IOException {
		// run FizzBuzz test using test constant integer 1 and test constant FizzBuzz test _1_
		this.doFizzBuzz(TestConstants.INT_1, TestConstants._1_);
		// run FizzBuzz test using test constant integer 2 and test constant FizzBuzz test _1_2_
		this.doFizzBuzz(TestConstants.INT_2, TestConstants._1_2_);
		// run FizzBuzz test using test constant integer 3 and test constant FizzBuzz test _1_2_FIZZ
		this.doFizzBuzz(TestConstants.INT_3, TestConstants._1_2_FIZZ);
		// run FizzBuzz test using test constant integer 4 and test constant FizzBuzz test _1_2_FIZZ_4
		this.doFizzBuzz(TestConstants.INT_4, TestConstants._1_2_FIZZ_4);
		// run FizzBuzz test using test constant integer 5 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ
		this.doFizzBuzz(TestConstants.INT_5, TestConstants._1_2_FIZZ_4_BUZZ);
		// run FizzBuzz test using test constant integer 6 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ
		this.doFizzBuzz(TestConstants.INT_6, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ);
		// run FizzBuzz test using test constant integer 7 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ_7
		this.doFizzBuzz(TestConstants.INT_7, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7);
		// run FizzBuzz test using test constant integer 8 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ_7_8
		this.doFizzBuzz(TestConstants.INT_8, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8);
		// run FizzBuzz test using test constant integer 9 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ
		this.doFizzBuzz(TestConstants.INT_9, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ);
		// run FizzBuzz test using test constant integer 10 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ
		this.doFizzBuzz(TestConstants.INT_10, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ);
		// run FizzBuzz test using test constant integer 11 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11
		this.doFizzBuzz(TestConstants.INT_11, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11);
		// run FizzBuzz test using test constant integer 12 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ
		this.doFizzBuzz(TestConstants.INT_12, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ);
		// run FizzBuzz test using test constant integer 13 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13
		this.doFizzBuzz(TestConstants.INT_13, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13);
		// run FizzBuzz test using test constant integer 14 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14
		this.doFizzBuzz(TestConstants.INT_14, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14);
		// run FizzBuzz test using test constant integer 15 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ
		this.doFizzBuzz(TestConstants.INT_15,
				TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ);
		// run FizzBuzz test using test constant integer 16 and test constant FizzBuzz test _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16
		this.doFizzBuzz(TestConstants.INT_16,
				TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16);
	}

}
