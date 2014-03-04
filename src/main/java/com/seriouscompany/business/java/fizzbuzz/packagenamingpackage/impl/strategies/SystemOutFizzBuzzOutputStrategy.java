package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import java.io.IOException;
import java.io.OutputStream;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class SystemOutFizzBuzzOutputStrategy implements FizzBuzzOutputStrategy {

	public static final OutputStream OUTPUT_STREAM = System.out;

	@Override
	public void output(String output) throws IOException {

		OUTPUT_STREAM.write(output.getBytes());

	}

}
