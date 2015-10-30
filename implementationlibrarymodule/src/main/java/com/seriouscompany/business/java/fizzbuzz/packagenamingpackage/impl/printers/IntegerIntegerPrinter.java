package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.IntegerIntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

@Service
public class IntegerIntegerPrinter implements IntegerPrinter {

	private final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory;

	private final IntegerIntegerStringReturnerFactory _integerIntegerStringReturnerFactory;

	@Autowired
	public IntegerIntegerPrinter(final IntegerIntegerStringReturnerFactory _integerIntegerStringReturnerFactory,
			final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory) {
		this._integerIntegerStringReturnerFactory = _integerIntegerStringReturnerFactory;
		this._systemOutFizzBuzzOutputStrategyFactory = _systemOutFizzBuzzOutputStrategyFactory;
	}

	public void printInteger(final int theInteger) {
		final IntegerStringReturner myIntegerStringReturner =
				this._integerIntegerStringReturnerFactory.createIntegerStringReturner();
		final String myIntegerString = myIntegerStringReturner.getIntegerReturnString(theInteger);
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(
						this._systemOutFizzBuzzOutputStrategyFactory.createOutputStrategy());

		myOutputAdapter.output(myIntegerString);
	}

	@Override
	public void print() {
		throw new UnsupportedOperationException(
				"com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.IntegerIntegerPrinter.print()");
	}

	@Override
	public void printValue(final Object value) {
		this.printInteger((Integer) value);
	}

}
