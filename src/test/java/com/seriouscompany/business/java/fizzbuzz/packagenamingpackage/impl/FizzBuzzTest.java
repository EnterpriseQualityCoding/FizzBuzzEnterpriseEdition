package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

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

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 1}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz1() throws IOException {
		doFizzBuzz(1, "1\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 2}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz2() throws IOException {
		doFizzBuzz(2, "1\n2\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 3}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz3() throws IOException {
		doFizzBuzz(3, "1\n2\nFizz\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 4}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz4() throws IOException {
		doFizzBuzz(4, "1\n2\nFizz\n4\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 5}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz5() throws IOException {
		doFizzBuzz(5, "1\n2\nFizz\n4\nBuzz\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 6}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz6() throws IOException {
		doFizzBuzz(6, "1\n2\nFizz\n4\nBuzz\nFizz\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 7}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz7() throws IOException {
		doFizzBuzz(7, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 8}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz8() throws IOException {
		doFizzBuzz(8, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 9}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz9() throws IOException {
		doFizzBuzz(9, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 10}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz10() throws IOException {
		doFizzBuzz(10, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 11}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz11() throws IOException {
		doFizzBuzz(11, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 12}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz12() throws IOException {
		doFizzBuzz(12, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 13}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz13() throws IOException {
		doFizzBuzz(13, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 14}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz14() throws IOException {
		doFizzBuzz(14, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 15}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz15() throws IOException {
		doFizzBuzz(15, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n");
	}

	/**
	 * Tests {@link FizzBuzz#fizzbuzz(int)} with an argument of {@code 16}.
	 *
	 * @throws IOException
	 *     Signals that an I/O exception of some sort has occurred.
	 */
	@Test
	public void testFizzBuzz16() throws IOException {
		doFizzBuzz(16, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n");
	}
}
