import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;

public class FizzBuzzTest {

	private PrintStream out;
	private FizzBuzz fb;

	@Before
	public void setUp() {
		final ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		this.fb = (FizzBuzz) context.getBean("standardFizzBuzz");
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
		this.doFizzBuzz(1, "1\n");
		this.doFizzBuzz(2, "1\n2\n");
		this.doFizzBuzz(3, "1\n2\nFizz\n");
		this.doFizzBuzz(4, "1\n2\nFizz\n4\n");
		this.doFizzBuzz(5, "1\n2\nFizz\n4\nBuzz\n");
		this.doFizzBuzz(6, "1\n2\nFizz\n4\nBuzz\nFizz\n");
		this.doFizzBuzz(7, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n");
		this.doFizzBuzz(8, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\n");
		this.doFizzBuzz(9, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\n");
		this.doFizzBuzz(10, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n");
		this.doFizzBuzz(11, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\n");
		this.doFizzBuzz(12, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n");
		this.doFizzBuzz(13, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n");
		this.doFizzBuzz(14, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\n");
		this.doFizzBuzz(15, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n");
		this.doFizzBuzz(16, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n");
	}
}
