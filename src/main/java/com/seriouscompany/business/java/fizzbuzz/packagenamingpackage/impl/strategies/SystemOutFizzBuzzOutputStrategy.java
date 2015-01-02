package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutFizzBuzzOutputStrategy implements FizzBuzzOutputStrategy {

	public final OutputStream outputStream;
	
	public SystemOutFizzBuzzOutputStrategy() {
		outputStream = System.out;
	}

	@Override
	public void output(final String output) throws IOException {

		outputStream.write(output.getBytes());
		outputStream.flush();

	}

}
