package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.IntegerIntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;

@Service
public class IntegerIntegerPrinterFactory implements IntegerPrinterFactory {

	private final IntegerIntegerPrinter _integerIntegerPrinter;

	@Autowired
	public IntegerIntegerPrinterFactory(final IntegerIntegerPrinter _integerIntegerPrinter) {
		super();
		this._integerIntegerPrinter = _integerIntegerPrinter;
	}

	@Override
	public IntegerPrinter createPrinter() {
		return this._integerIntegerPrinter;
	}

}
