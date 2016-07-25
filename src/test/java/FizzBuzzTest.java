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

	private static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16 = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n";
	private static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";
	private static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14 = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\n";
	private static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13 = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n";
	private static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n";
	private static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11 = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\n";
	private static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n";
	private static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\n";
	private static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8 = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\n";
	private static final String _1_2_FIZZ_4_BUZZ_FIZZ_7 = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n";
	private static final String _1_2_FIZZ_4_BUZZ_FIZZ = "1\n2\nFizz\n4\nBuzz\nFizz\n";
	private static final String _1_2_FIZZ_4_BUZZ = "1\n2\nFizz\n4\nBuzz\n";
	private static final String _1_2_FIZZ_4 = "1\n2\nFizz\n4\n";
	private static final String _1_2_FIZZ = "1\n2\nFizz\n";
	private static final String _1_2_ = "1\n2\n";
	private static final String _1_ = "1\n";
	private static final String STANDARD_FIZZ_BUZZ = "standardFizzBuzz";
	private static final String SPRING_XML = "spring.xml";
	private PrintStream out;
	private FizzBuzz fb;

	@Before
	public void setUp() {
		final ApplicationContext context = new ClassPathXmlApplicationContext(SPRING_XML);
		this.fb = (FizzBuzz) context.getBean(STANDARD_FIZZ_BUZZ);
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
		this.doFizzBuzz(1, _1_);
		this.doFizzBuzz(2, _1_2_);
		this.doFizzBuzz(3, _1_2_FIZZ);
		this.doFizzBuzz(4, _1_2_FIZZ_4);
		this.doFizzBuzz(5, _1_2_FIZZ_4_BUZZ);
		this.doFizzBuzz(6, _1_2_FIZZ_4_BUZZ_FIZZ);
		this.doFizzBuzz(7, _1_2_FIZZ_4_BUZZ_FIZZ_7);
		this.doFizzBuzz(8, _1_2_FIZZ_4_BUZZ_FIZZ_7_8);
		this.doFizzBuzz(9, _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ);
		this.doFizzBuzz(10, _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ);
		this.doFizzBuzz(11, _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11);
		this.doFizzBuzz(12, _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ);
		this.doFizzBuzz(13, _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13);
		this.doFizzBuzz(14, _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14);
		this.doFizzBuzz(15, _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ);
		this.doFizzBuzz(16, _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16);
	}
}
