package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.printers.BuzzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

public class BuzzStringPrinterFactory implements StringPrinterFactory {

	@Override
	public StringPrinter createPrinter() {
		final StringPrinter myBuzzStringPrinter = new BuzzStringPrinter();
		return myBuzzStringPrinter;
	}

}
