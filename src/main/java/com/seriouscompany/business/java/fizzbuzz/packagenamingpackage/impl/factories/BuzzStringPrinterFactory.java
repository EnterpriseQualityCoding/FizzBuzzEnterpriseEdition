// BuzzStringPrinterFactory.java
// Faactory for BuzzStringPrinter

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

// imports org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Autowired;
// imports org.springframework.stereotype.Service
import org.springframework.stereotype.Service;

// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.BuzzStringPrinter
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.BuzzStringPrinter;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

/**
 * Factory for BuzzStringPrinter
 */
@Service
public class BuzzStringPrinterFactory implements StringPrinterFactory {

	// create a private constant using BuzzStringPrinter called `_buzzStringPrinter` with no value
	private final BuzzStringPrinter _buzzStringPrinter;

	/**
	 * @param _buzzStringPrinter BuzzStringPrinter
	 */
	@Autowired
	// create constructor
	public BuzzStringPrinterFactory(final BuzzStringPrinter _buzzStringPrinter) {
		// create a quick pointer `super` thing to access the accessor from the accessor method of the accessed object
		super();
		// set attribute `_buzzStringPrinter` to parameter constant `_buzzStringParameter`
		this._buzzStringPrinter = _buzzStringPrinter;
	}

	/**
	 * @return StringPrinter
	 */
	@Override
	// create public method called `createStringPrinter` which returns type StringPrinter
	public StringPrinter createStringPrinter() {
		// return attribute `_buzzStringPrinter`
		return this._buzzStringPrinter;
	}

}
