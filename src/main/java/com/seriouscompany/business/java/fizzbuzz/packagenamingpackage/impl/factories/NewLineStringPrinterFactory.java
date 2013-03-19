package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.NewLineStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

public class NewLineStringPrinterFactory implements StringPrinterFactory {

	@Override
	public StringPrinter createStringPrinter() {
		NewLineStringPrinter myNewLineStringPrinter = new NewLineStringPrinter();
		return myNewLineStringPrinter;
	}

}
