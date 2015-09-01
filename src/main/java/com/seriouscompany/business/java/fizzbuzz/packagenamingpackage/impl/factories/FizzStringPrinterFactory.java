package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.FizzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

import javax.annotation.Nonnull;

@Service
public class FizzStringPrinterFactory implements StringPrinterFactory {

	@Nonnull
	private final FizzStringPrinter _fizzStringPrinter;

	@Autowired
	public FizzStringPrinterFactory(@Nonnull final FizzStringPrinter _fizzStringPrinter) {
		this._fizzStringPrinter = _fizzStringPrinter;
	}

	@Nonnull
	@Override
	public StringPrinter createStringPrinter() {
		return this._fizzStringPrinter;
	}

}
