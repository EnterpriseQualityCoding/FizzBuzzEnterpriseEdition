package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

@Service
public class BuzzStringPrinter implements StringPrinter {

	@Autowired
	private SystemOutFizzBuzzOutputStrategyFactory _outputStrategyFactory;
	
	@Autowired
	private BuzzStringReturnerFactory _buzzStringReturnerFactory;

	public void print() {
		final StringStringReturner myBuzzStringReturner = _buzzStringReturnerFactory
				.createStringStringReturner();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(_outputStrategyFactory.createOutputStrategy());

		myOutputAdapter.output(myBuzzStringReturner.getReturnString());
	}

	@Override
	public void printValue(Object value) {
		print();
	}
}
