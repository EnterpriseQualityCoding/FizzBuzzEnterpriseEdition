package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * Printer for FizzString
 */
@Service
public class FizzStringPrinter implements StringPrinter {

	private final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory;

	private final FizzStringReturnerFactory _fizzStringReturnerFactory;

	/**
	 * @param _fizzStringReturnerFactory FizzStringReturnerFactory
	 * @param _systemOutFizzBuzzOutputStrategyFactory SystemOutFizzBuzzOutputStrategyFactory
	 */
	@Autowired
	public FizzStringPrinter(final FizzStringReturnerFactory _fizzStringReturnerFactory,
			final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory) {
		super();
		this._fizzStringReturnerFactory = _fizzStringReturnerFactory;
		this._systemOutFizzBuzzOutputStrategyFactory = _systemOutFizzBuzzOutputStrategyFactory;
	}

	/**
	 * @return void
	 */
	public void print() {
		final StringStringReturner myFizzStringReturner = this._fizzStringReturnerFactory
			.createStringStringReturner();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(
						this._systemOutFizzBuzzOutputStrategyFactory.createOutputStrategy());

		myOutputAdapter.output(myFizzStringReturner.getReturnString());
	}

	/**
	 * @param value
	 */
	@Override
	public void printValue(final Object value) {
		this.print();
	}

}
