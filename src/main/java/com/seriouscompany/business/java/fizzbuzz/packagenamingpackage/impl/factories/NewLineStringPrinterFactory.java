package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.NewLineStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

import javax.annotation.Nonnull;

@Service
public class NewLineStringPrinterFactory implements StringPrinterFactory {

	@Nonnull
	private final NewLineStringPrinter _newLineStringPrinter;

	@Autowired
	public NewLineStringPrinterFactory(@Nonnull final NewLineStringPrinter _newLineStringPrinter) {
		this._newLineStringPrinter = _newLineStringPrinter;
	}

	@Nonnull
	@Override
	public StringPrinter createStringPrinter() {
		return this._newLineStringPrinter;
	}

}
