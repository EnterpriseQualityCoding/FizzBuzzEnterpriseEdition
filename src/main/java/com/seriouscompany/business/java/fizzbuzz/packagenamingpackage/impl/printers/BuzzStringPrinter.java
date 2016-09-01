package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class BuzzStringPrinter implements StringPrinter {

	private final SystemOutFizzBuzzOutputStrategyFactory _outputStrategyFactory;

	private final BuzzStringReturnerFactory _buzzStringReturnerFactory;

	@Autowired
	public BuzzStringPrinter(final BuzzStringReturnerFactory _buzzStringReturnerFactory,
			final SystemOutFizzBuzzOutputStrategyFactory _outputStrategyFactory) {
		super();
		this._buzzStringReturnerFactory = _buzzStringReturnerFactory;
		this._outputStrategyFactory = _outputStrategyFactory;
	}

	public void print() {
		final StringStringReturner myBuzzStringReturner = this._buzzStringReturnerFactory
			.createStringStringReturner();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(
						this._outputStrategyFactory.createOutputStrategy());

		myOutputAdapter.output(myBuzzStringReturner.getReturnString());
	}

	@Override
	public void printValue(final Object value) {
		this.print();
	}

}
