package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.SystemOutFizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

@Service
public class SystemOutFizzBuzzOutputStrategyFactory implements
		FizzBuzzOutputStrategyFactory {

	private final SystemOutFizzBuzzOutputStrategy _systemOutFizzBuzzOutputStrategy;

	@Autowired
	public SystemOutFizzBuzzOutputStrategyFactory(final SystemOutFizzBuzzOutputStrategy _systemOutFizzBuzzOutputStrategy) {
		super();
		this._systemOutFizzBuzzOutputStrategy = _systemOutFizzBuzzOutputStrategy;
	}

	@Override
	public FizzBuzzOutputStrategy createOutputStrategy() {

		return this._systemOutFizzBuzzOutputStrategy;

	}

}
