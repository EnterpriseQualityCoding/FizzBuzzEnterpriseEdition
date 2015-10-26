package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.NewLineStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

@Service
public class NewLineStringPrinterFactory implements StringPrinterFactory {

	@Autowired
	private NewLineStringPrinter _newLineStringPrinter;
	
	@Override
	public StringPrinter createStringPrinter() {
		return _newLineStringPrinter;
	}

}
