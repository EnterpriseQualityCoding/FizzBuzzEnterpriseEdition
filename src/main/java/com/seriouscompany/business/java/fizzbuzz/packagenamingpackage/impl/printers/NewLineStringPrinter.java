package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NewLineStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

@Service
public class NewLineStringPrinter implements StringPrinter {

	@Autowired
	private SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory;
	
	@Autowired
	private NewLineStringReturnerFactory _newLineStringReturnerFactory;

	public void print() {
		final StringStringReturner myNewLineStringReturner = _newLineStringReturnerFactory
				.createStringStringReturner();
		final String myNewLineString = myNewLineStringReturner.getReturnString();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(_systemOutFizzBuzzOutputStrategyFactory.createOutputStrategy());

		myOutputAdapter.output(myNewLineString);
	}

	@Override
	public void printValue(Object value) {
		print();
	}

}
