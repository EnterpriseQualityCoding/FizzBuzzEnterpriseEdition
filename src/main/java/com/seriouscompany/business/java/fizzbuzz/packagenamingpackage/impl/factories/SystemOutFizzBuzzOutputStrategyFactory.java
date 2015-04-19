package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.SystemOutFizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;

@Service
public class SystemOutFizzBuzzOutputStrategyFactory implements
		FizzBuzzOutputStrategyFactory {

	@Autowired
	SystemOutFizzBuzzOutputStrategy _systemOutFizzBuzzOutputStrategy;
	
	@Override
	public FizzBuzzOutputStrategy createOutputStrategy() {

		return _systemOutFizzBuzzOutputStrategy;
		
	}

}
