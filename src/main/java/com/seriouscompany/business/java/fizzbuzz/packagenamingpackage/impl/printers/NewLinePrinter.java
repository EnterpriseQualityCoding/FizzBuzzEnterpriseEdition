package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

@Service
public class NewLinePrinter {
	
	@Autowired
	private SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory;
	
	public void printNewLine() {
		final NewLineStringReturner myNewLineStringReturner = new NewLineStringReturner();
		final String myNewLineString = myNewLineStringReturner.getReturnString();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(_systemOutFizzBuzzOutputStrategyFactory.createOutputStrategy());

		myOutputAdapter.output(myNewLineString);
	}
	
}
