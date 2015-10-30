package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.BuzzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

@Service
public class BuzzStringPrinterFactory implements StringPrinterFactory {

	private final BuzzStringPrinter _buzzStringPrinter;

	@Autowired
	public BuzzStringPrinterFactory(final BuzzStringPrinter _buzzStringPrinter) {
		this._buzzStringPrinter = _buzzStringPrinter;
	}

	@Override
	public StringPrinter createStringPrinter() {
		return this._buzzStringPrinter;
	}

}
