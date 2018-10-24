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
		String platformDependentExpectedResult = s.replaceAll("\\n", System.getProperty("line.separator"));
		assertEquals(platformDependentExpectedResult, baos.toString());
	}

	@Test
	public void testFizzBuzz() throws IOException {
		this.doFizzBuzz(TestConstants.INT_1, TestConstants._1_);
		this.doFizzBuzz(TestConstants.INT_2, TestConstants._1_2_);
		this.doFizzBuzz(TestConstants.INT_3, TestConstants._1_2_FIZZ);
		this.doFizzBuzz(TestConstants.INT_4, TestConstants._1_2_FIZZ_4);
		this.doFizzBuzz(TestConstants.INT_5, TestConstants._1_2_FIZZ_4_BUZZ);
		this.doFizzBuzz(TestConstants.INT_6, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ);
		this.doFizzBuzz(TestConstants.INT_7, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7);
		this.doFizzBuzz(TestConstants.INT_8, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8);
		this.doFizzBuzz(TestConstants.INT_9, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ);
		this.doFizzBuzz(TestConstants.INT_10, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ);
		this.doFizzBuzz(TestConstants.INT_11, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11);
		this.doFizzBuzz(TestConstants.INT_12, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ);
		this.doFizzBuzz(TestConstants.INT_13, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13);
		this.doFizzBuzz(TestConstants.INT_14, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14);
		this.doFizzBuzz(TestConstants.INT_15,
				TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ);
		this.doFizzBuzz(TestConstants.INT_16,
				TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16);
	}
	
	private int countCharCount(final String string, final String character) {
		return string.length() - string.replace(character, "").length();
	}


	// https://stackoverflow.com/a/24063511/5223757
	private static <A, B> Stream<Pair<A, B>> zipTwoStreams(Stream<A> as, Stream<B> bs)
	{
		Iterator<A> i=as.iterator();
		return bs.filter(x->i.hasNext()).map(b->new Pair<>(i.next(), b));
	}
	
	private void assertFizzBuzz(final String fizzBuzzStringLineString, final Integer fizzBuzzStringLineNumber) {
		final int fizzBuzzStringLineNumberInt = fizzBuzzStringLineNumber.intValue();
		final boolean fizzBuzzStringLineNumberIntModuloThreeBoolean = fizzBuzzStringLineNumberInt % TestConstants.INT_3;
		final boolean fizzBuzzStringLineNumberIntModuloFiveBoolean = fizzBuzzStringLineNumberInt % TestConstants.INT_5;
		if (fizzBuzzStringLineNumberIntModuloThreeBoolean && fizzBuzzStringLineNumberIntModuloFiveBoolean) {
			final Integer fizzBuzzStringLineNumberIntInteger = Integer.valueOf(fizzBuzzStringLineNumberIntInteger);
			final String fizzBuzzStringLineNumberIntIntegerString = fizzBuzzStringLineNumberIntInteger.toString();
			assertEqual(fizzBuzzStringLineString, fizzBuzzStringLineNumberIntIntegerString);
		} else {
			assertEqual(fizzBuzzStringLineString.length() % TestConstants.INT_4, TestConstants.INT_0);
			assertEqual(fizzBuzzStringLineString.length() > 0, true);
			final boolean fizzBuzzStringLineNumberIntModuloThreeBooleanNegated = !fizzBuzzStringLineNumberIntModuloThreeBoolean;
			final boolean fizzBuzzStringLineNumberIntModuloFiveBooleanNegated = !fizzBuzzStringLineNumberIntModuloFiveBoolean;
			if (fizzBuzzStringLineNumberIntModuloThreeBooleanNegated) {
				final String fizzBuzzStringLineStringFirstFour = fizzBuzzStringLineString.substring(TestConstants.INT_0, TestConstants.INT_4);
				assertEqual(fizzBuzzStringLineStringFirstFour, TestConstants.FIZZ);
			}
			if (fizzBuzzStringLineNumberIntModuloFiveBooleanNegated) {
				final int fizzBuzzStringLineStringLengthMinusFour = fizzBuzzStringLineString.length() - TestConstants.INT_4;
				final String fizzBuzzStringLineStringLastFour = fizzBuzzStringLineString.substring(fizzBuzzStringLineStringLengthMinusFour, fizzBuzzStringLineString.length());
				assertEqual(fizzBuzzStringLineStringLastFounr, TestConstants.BUZZ);
			}
		}
	}

	private void doFizzingAndBuzzing(final int testNumber) throws IOException {
		final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		final BufferedOutputStream byteArrayOutputStreamBufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
		final PrintStream byteArrayOutputStreamBufferedOutputStreamPrintStream = new PrintStream(byteArrayOutputStreamBufferedOutputStream);
		System.setOut(byteArrayOutputStreamBufferedOutputStreamPrintStream);

		this.fb.fizzBuzz(testNumber);

		System.out.flush();
		final String testNumberByteArrayOutputStreamFizzBuzzString = byteArrayOutputStream.toString();
		final int testNumberByteArrayOutputStreamFizzBuzzStringCharCountLineCount = countCharCount(testNumberByteArrayOutputStreamFizzBuzzString, System.getProperty("line.separator"));
		final Stream<String> testNumberByteArrayOutputStreamFizzBuzzStringLinesStream = testNumberByteArrayOutputStreamFizzBuzzString.lines();
		final String[] testNumberByteArrayOutputStreamFizzBuzzStringLinesStreamArray = testNumberByteArrayOutputStreamFizzBuzzStringLinesStream.toArray(String[]::new);
		final int testNumberByteArrayOutputStreamFizzBuzzStringLinesStreamArrayLengthLineCount = testNumberByteArrayOutputStreamFizzBuzzStringLinesStreamArray.length;

		assertEqual(testNumber, testNumberByteArrayOutputStreamFizzBuzzStringCharCountLineCount);
		assertEqual(testNumber, testNumberByteArrayOutputStreamFizzBuzzStringLinesStreamArrayLengthLineCount);
		assertEqual(testNumberByteArrayOutputStreamFizzBuzzStringCharCountLineCount, testNumberByteArrayOutputStreamFizzBuzzStringLinesStreamArrayLengthLineCount);
		
		final Stream<String> testNumberByteArrayOutputStreamFizzBuzzStringLinesStreamArrayStream = Stream.of(testNumberByteArrayOutputStreamFizzBuzzStringLinesStreamArray);
		final IntStream oneToTestNumberInclusiveIntStream = IntStream.range(1, testNumber + 1);
		final Stream<Integer> oneToTestNumberInclusiveIntStreamStream = oneToTestNumberInclusiveIntStreamStream.mapToObj(Integer::new);
		
		final Stream<Pair<String, Integer>> testNumberByteArrayOutputStreamFizzBuzzStringLinesStreamArrayStreamOneToTestNumberInclusiveIntStreamStreamZipStream = zip(testNumberByteArrayOutputStreamFizzBuzzStreamCharCountLineCount, oneToTestNumberInclusiveIntStreamStream);

		testNumberByteArrayOutputStreamFizzBuzzStringLinesStreamArrayStreamOneToTestNumberInclusiveIntStreamStreamZipStream.forEach(assertFizzBuzz);
	}

	@Test
	public void testFizzingAndBuzzing() throws IOException {
		for (int testNumber = TestConstants.INT_1; testNumber <= TestConstants.INT_MAX; testNumber += TestConstants.INT_1) {
			doFizzingAndBuzzing(testNumber);
		}
	}

}
