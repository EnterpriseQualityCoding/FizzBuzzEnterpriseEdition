package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

/**
 * Strategy for SystemOutFizzBuzzOutput
 */
@Service
public class SystemOutFizzBuzzOutputStrategy implements FizzBuzzOutputStrategy {

	/**
	 * @param output String
	 * @throws IOException
	 * @return void
	 */
	@Override
	public void output(final String output) throws IOException {
		System.out.write(output.getBytes());
		System.out.flush();
	}

}
