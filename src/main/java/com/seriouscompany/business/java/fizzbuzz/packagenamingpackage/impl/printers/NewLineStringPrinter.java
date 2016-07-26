package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NewLineStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class NewLineStringPrinter implements StringPrinter {

	private final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory;

	private final NewLineStringReturnerFactory _newLineStringReturnerFactory;

	@Autowired
	public NewLineStringPrinter(final NewLineStringReturnerFactory _newLineStringReturnerFactory,
			final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory) {
		super();
		this._newLineStringReturnerFactory = _newLineStringReturnerFactory;
		this._systemOutFizzBuzzOutputStrategyFactory = _systemOutFizzBuzzOutputStrategyFactory;
	}

	public void print() {
		final StringStringReturner myNewLineStringReturner = this._newLineStringReturnerFactory
			.createStringStringReturner();
		final String myNewLineString = myNewLineStringReturner.getReturnString();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(
						this._systemOutFizzBuzzOutputStrategyFactory.createOutputStrategy());

		myOutputAdapter.output(myNewLineString);
	}

	@Override
	public void printValue(final Object value) {
		this.print();
	}

}
