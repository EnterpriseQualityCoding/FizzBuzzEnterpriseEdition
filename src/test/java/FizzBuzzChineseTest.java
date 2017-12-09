import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzChineseTest {

	private PrintStream out;
	private FizzBuzz fb;

	@Before
	public void setUp() {
		System.setProperty("user.locale", "zh_CN");
		final ApplicationContext context = new ClassPathXmlApplicationContext(TestConstants.SPRING_XML);
		this.fb = (FizzBuzz) context.getBean(TestConstants.STANDARD_FIZZ_BUZZ);
		this.out = System.out;
		((ConfigurableApplicationContext) context).close();
	}

	@After
	public void tearDown() {
		System.setOut(this.out);
	}

	private void doFizzBuzz(final int inputNumber, final String expectedResult) throws IOException {
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		final BufferedOutputStream bos = new BufferedOutputStream(baos);
		System.setOut(new PrintStream(bos));

		this.fb.fizzBuzz(inputNumber);

		System.out.flush();
		String platformDependentExpectedResult = expectedResult.replaceAll("\\n", System.getProperty("line.separator"));
		assertEquals(platformDependentExpectedResult, baos.toString());
	}

	@Test
	public void testFizzBuzz() throws IOException {
		this.doFizzBuzz(TestConstants.INT_1, ChineseTestConstants._1_);
		this.doFizzBuzz(TestConstants.INT_2, ChineseTestConstants._1_2_);
		this.doFizzBuzz(TestConstants.INT_3, ChineseTestConstants._1_2_FIZZ);
		this.doFizzBuzz(TestConstants.INT_4, ChineseTestConstants._1_2_FIZZ_4);
		this.doFizzBuzz(TestConstants.INT_5, ChineseTestConstants._1_2_FIZZ_4_BUZZ);
		this.doFizzBuzz(TestConstants.INT_6, ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ);
		this.doFizzBuzz(TestConstants.INT_7, ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7);
		this.doFizzBuzz(TestConstants.INT_8, ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8);
		this.doFizzBuzz(TestConstants.INT_9, ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ);
		this.doFizzBuzz(TestConstants.INT_10, ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ);
		this.doFizzBuzz(TestConstants.INT_11, ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11);
		this.doFizzBuzz(TestConstants.INT_12, ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ);
		this.doFizzBuzz(TestConstants.INT_13, ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13);
		this.doFizzBuzz(TestConstants.INT_14, ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14);
		this.doFizzBuzz(TestConstants.INT_15,
				ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ);
		this.doFizzBuzz(TestConstants.INT_16,
				ChineseTestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16);
	}

}
