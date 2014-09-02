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
    private String[] precomputedResults = {
        "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16"
    };

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

		fb.fizzBuzz(new FizzBuzzParameterFactoryMock(1, n, 1));

		System.out.flush();
		assertEquals(s, baos.toString());
	}

    private String generateFizzBuzzFor(int i) {
        if ((i % 15) == 0) {
            return "FizzBuzz";
        } else if ((i % 5) == 0) {
            return "Buzz";
        } else if ((i % 3) == 0) {
            return "Fizz";
        } else {
            return "" + i;
        }
    }

    @Test
    public void testFizzBuzz() throws IOException {
        String expectedResult = "";
        for (int i = 1; i <= 100; i++) {
            expectedResult += generateFizzBuzzFor(i) + "\n";
            doFizzBuzz(i, expectedResult);
        }
    }

	@Test
	public void testFizzBuzzGenerator() throws IOException {
        for (int i = 0; i < precomputedResults.length; i++) {
            assertEquals(precomputedResults[i], generateFizzBuzzFor(i + 1));
        }
	}
}
