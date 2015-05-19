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
import java.util.Arrays;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;

public class FizzBuzzTest {
	private PrintStream out;
	private FizzBuzz fb;

	@Before
	public void setUp() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		fb = (FizzBuzz) context.getBean("standardFizzBuzz");
		out = System.out;
		((ConfigurableApplicationContext) context).close();
	}

	@After
	public void tearDown() {
		System.setOut(out);
	}

	private void doFizzBuzz(int n, String s) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(baos);
		System.setOut(new PrintStream(bos));

		fb.fizzBuzz(n);

		System.out.flush();
		assertEquals(s, baos.toString());
	}
	
	private String generateFizzBuzzTestStringsUntil20 (int length) {
		if (length < 1 || length > 20) {
			throw new IllegalArgumentException("generateFizzBuzzTestStringsUntil20 must be called with a length from 1-20");
		}
		String[] outputs = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
		String output = "";
		for(String s: Arrays.asList(outputs).subList(0, length)) {
			output = output + String.format(s + "%n");
		}
		System.out.println(output);
		return output;
	}

	@Test
	public void testFizzBuzz() throws IOException {
		for(int i = 1; i <=20; i++) {
			doFizzBuzz(i, generateFizzBuzzTestStringsUntil20(i));
		}
	}
}
