package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.printers.NewLineStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

public class NewLineStringPrinterFactory implements StringPrinterFactory {

	@Override
	public StringPrinter createPrinter() {
		final StringPrinter myNewLineStringPrinter = new NewLineStringPrinter();
		return myNewLineStringPrinter;
	}

}
