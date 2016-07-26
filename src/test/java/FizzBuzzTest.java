import static org.junit.Assert.assertEquals;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;

public class FizzBuzzTest {

	private PrintStream out;
	private FizzBuzz fb;

	@Before
	public void setUp() {
		final ApplicationContext context = new ClassPathXmlApplicationContext(TestConstants.SPRING_XML);
		this.fb = (FizzBuzz) context.getBean(TestConstants.STANDARD_FIZZ_BUZZ);
		this.out = System.out;
		((ConfigurableApplicationContext) context).close();
	}

	@After
	public void tearDown() {
		System.setOut(this.out);
	}

	private void doFizzBuzz(final int n, final String s) throws IOException {
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		final BufferedOutputStream bos = new BufferedOutputStream(baos);
		System.setOut(new PrintStream(bos));

		this.fb.fizzBuzz(n);

		System.out.flush();
		assertEquals(s, baos.toString());
	}

	@Test
	public void testFizzBuzz() throws IOException {
		this.doFizzBuzz(TestConstants._1, TestConstants._1_);
		this.doFizzBuzz(TestConstants._2, TestConstants._1_2_);
		this.doFizzBuzz(TestConstants._3, TestConstants._1_2_FIZZ);
		this.doFizzBuzz(TestConstants._4, TestConstants._1_2_FIZZ_4);
		this.doFizzBuzz(TestConstants._5, TestConstants._1_2_FIZZ_4_BUZZ);
		this.doFizzBuzz(TestConstants._6, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ);
		this.doFizzBuzz(TestConstants._7, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7);
		this.doFizzBuzz(TestConstants._8, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8);
		this.doFizzBuzz(TestConstants._9, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ);
		this.doFizzBuzz(TestConstants._10, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ);
		this.doFizzBuzz(TestConstants._11, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11);
		this.doFizzBuzz(TestConstants._12, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ);
		this.doFizzBuzz(TestConstants._13, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13);
		this.doFizzBuzz(TestConstants._14, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14);
		this.doFizzBuzz(TestConstants._15, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ);
		this.doFizzBuzz(TestConstants._16,
				TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16);
	}
}
