package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.SystemOutFizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

public class SystemOutFizzBuzzOutputStrategyFactory implements
		FizzBuzzOutputStrategyFactory {

	@Override
	public FizzBuzzOutputStrategy createOutputStrategy() {

		return new SystemOutFizzBuzzOutputStrategy();
		
	}

}
