package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

@Service
public class FizzPrinter {

	@Autowired
	private SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory;

	public void printFizz() {
		final FizzStringReturner myFizzStringReturner = new FizzStringReturner();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(_systemOutFizzBuzzOutputStrategyFactory.createOutputStrategy());

		myOutputAdapter.output(myFizzStringReturner.getReturnString());
	}

}
