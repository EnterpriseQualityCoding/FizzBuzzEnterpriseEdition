import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.FizzBuzz;

public class FizzBuzzTest {
	private PrintStream out;
	private FizzBuzz fb;

	@Before
	public void setUp() {
		fb = new FizzBuzz();
		out = System.out;
	}

	@After
	public void tearDown() {
		System.setOut(out);
	}

	private void doFizzBuzz(int n, String s) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(baos);
		System.setOut(new PrintStream(bos));

		fb.fizzbuzz(n);

		System.out.flush();
		assertEquals(s, baos.toString());
	}

	@Test
	public void testFizzBuzz() throws IOException {
		doFizzBuzz(1, "1\n");
		doFizzBuzz(2, "1\n2\n");
		doFizzBuzz(3, "1\n2\nFizz\n");
		doFizzBuzz(4, "1\n2\nFizz\n4\n");
		doFizzBuzz(5, "1\n2\nFizz\n4\nBuzz\n");
		doFizzBuzz(6, "1\n2\nFizz\n4\nBuzz\nFizz\n");
		doFizzBuzz(7, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n");
		doFizzBuzz(8, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\n");
		doFizzBuzz(9, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\n");
		doFizzBuzz(10, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n");
		doFizzBuzz(11, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\n");
		doFizzBuzz(12, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n");
		doFizzBuzz(13, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n");
		doFizzBuzz(14, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\n");
		doFizzBuzz(15, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n");
		doFizzBuzz(16, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n");
	}
}
