package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

@Service
public class IntegerPrinter {

	private final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory;

	@Autowired
	public IntegerPrinter(final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory) {
		this._systemOutFizzBuzzOutputStrategyFactory = _systemOutFizzBuzzOutputStrategyFactory;
	}

	public void printInteger(final int theInteger) {
		final IntegerStringReturner myIntegerIntegerStringReturner = new IntegerIntegerStringReturner();
		final String myIntegerString = myIntegerIntegerStringReturner
			.getIntegerReturnString(theInteger);
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(
						this._systemOutFizzBuzzOutputStrategyFactory.createOutputStrategy());

		myOutputAdapter.output(myIntegerString);
	}

}
