package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

import javax.annotation.Nonnull;

@Service
public class SystemOutFizzBuzzOutputStrategy implements FizzBuzzOutputStrategy {

	@Override
	public void output(@Nonnull final String output) throws IOException {

		System.out.write(output.getBytes());
		System.out.flush();

	}

}
