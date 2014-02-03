package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.BuzzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

public class BuzzStringPrinterFactory implements StringPrinterFactory {

	@Override
	public StringPrinter createStringPrinter() {
		final StringPrinter myBuzzStringPrinter = new BuzzStringPrinter();
		return myBuzzStringPrinter;
	}

}
