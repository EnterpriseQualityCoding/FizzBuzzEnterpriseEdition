package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.SystemOutFizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

import javax.annotation.Nonnull;

@Service
public class SystemOutFizzBuzzOutputStrategyFactory implements
		FizzBuzzOutputStrategyFactory {

	@Nonnull
	private final SystemOutFizzBuzzOutputStrategy _systemOutFizzBuzzOutputStrategy;

	@Autowired
	public SystemOutFizzBuzzOutputStrategyFactory(@Nonnull final SystemOutFizzBuzzOutputStrategy _systemOutFizzBuzzOutputStrategy) {
		this._systemOutFizzBuzzOutputStrategy = _systemOutFizzBuzzOutputStrategy;
	}

	@Nonnull
	@Override
	public FizzBuzzOutputStrategy createOutputStrategy() {

		return this._systemOutFizzBuzzOutputStrategy;

	}

}
