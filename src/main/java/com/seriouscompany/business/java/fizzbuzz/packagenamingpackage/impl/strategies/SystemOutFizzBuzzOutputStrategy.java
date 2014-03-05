package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import java.io.IOException;
import java.io.OutputStream;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class SystemOutFizzBuzzOutputStrategy implements FizzBuzzOutputStrategy {

	public final OutputStream outputStream;
	
	public SystemOutFizzBuzzOutputStrategy() {
		outputStream = System.out;
	}

	@Override
	public void output(String output) throws IOException {

		outputStream.write(output.getBytes());
		outputStream.flush();

	}

}
