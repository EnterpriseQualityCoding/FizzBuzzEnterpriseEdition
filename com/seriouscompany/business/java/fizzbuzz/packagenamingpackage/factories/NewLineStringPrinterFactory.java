package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.NewLineStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.StringPrinter;

public class NewLineStringPrinterFactory implements StringPrinterFactory {

	@Override
	public StringPrinter createStringPrinter() {
		NewLineStringPrinter myNewLineStringPrinter = new NewLineStringPrinter();
		return myNewLineStringPrinter;
	}

}
