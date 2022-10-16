// IntegerIntegerPrinter.java
// Printer for IntegerInteger

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

// imports org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Autowired;
// imports org.springframework.stereotype.Service
import org.springframework.stereotype.Service;

// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.IntegerIntegerStringReturnerFactory
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.IntegerIntegerStringReturnerFactory;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

/**
 * Printer for IntegerInteger
 */
@Service
public class IntegerIntegerPrinter implements IntegerPrinter {

	// create instance of factory called SystemOutFizzBuzzOutputStrategyFactory called `_systemOutFizzBuzzOutputStrategyFactory`
	private final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory;

	// create instance of factory called IntegerIntegerStringReturnerFactory called `_integerIntegerStringReturnerFactory`
	private final IntegerIntegerStringReturnerFactory _integerIntegerStringReturnerFactory;

	/**
	 * @param _integerIntegerStringReturnerFactory IntegerIntegerStringReturnerFactory
	 * @param _systemOutFizzBuzzOutputStrategyFactory SystemOutFizzBuzzOutputStrategyFactory
	 */
	@Autowired
	public IntegerIntegerPrinter(final IntegerIntegerStringReturnerFactory _integerIntegerStringReturnerFactory, // create constructor for IntegerIntegerPrinter
			final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory) {
		// create a quick pointer `super` thing to access the accessor from the accessor method of the accessed object
		super();
		// sets the attribute `_integerIntegerStringReturnerFactory` to the value of the parameter called `_integerIntegerStringReturnerFactory`
		this._integerIntegerStringReturnerFactory = _integerIntegerStringReturnerFactory;
		// sets the attribute `_systemOutFizzBuzzOutputStrategyFactory` to the value of the parameter called `_systemOutFizzBuzzOutputStrategyFactory`
		this._systemOutFizzBuzzOutputStrategyFactory = _systemOutFizzBuzzOutputStrategyFactory;
	}

	/**
	 * @param theInteger
	 */
	public void printInteger(final int theInteger) {
		// create a constant called `myIntegerStringReturner` using `IntegerStringReturner` which takes the value of the returned value of the method `createIntegerStringReturner` of attribute `_integerIntegerStringReturnerFactory`
		final IntegerStringReturner myIntegerStringReturner =
				this._integerIntegerStringReturnerFactory.createIntegerStringReturner();
		// create constant called `myIntegerString` of type String which takes the value of the returned value of the method `getIntegerReturnString` from `myIntegerStringReturner`. `getIntegerReturnString` from `myIntegerStringReturner` is passed the parameter `theInteger`
		final String myIntegerString = myIntegerStringReturner.getIntegerReturnString(theInteger);
		// create a new `FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter` constant called `myOutputAdapter` which is passed the value of the return value of the method `createOutputStrategy` from attribute `_systemOutFizzBuzzOutputStrategyFactory`
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(
						this._systemOutFizzBuzzOutputStrategyFactory.createOutputStrategy());

		// call method `output` from `FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter` called `myOutputAdapter` and pass the method `myIntegerString`
		myOutputAdapter.output(myIntegerString);
	}

	/**
	 * @return void
	 */
	@Override
	public void print() {
		// throw an exception of type `UnsupportedOperationException` which takes the constant defined in `com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants` called `COM_SERIOUSCOMPANY_BUSINESS_JAVA_FIZZBUZZ_PACKAGENAMINGPACKAGE_IMPL_PRINTERS_INTEGER_INTEGER_PRINTER_PRINT` which contains the string "com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.IntegerIntegerPrinter.print()"
		throw new UnsupportedOperationException(
				com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants.COM_SERIOUSCOMPANY_BUSINESS_JAVA_FIZZBUZZ_PACKAGENAMINGPACKAGE_IMPL_PRINTERS_INTEGER_INTEGER_PRINTER_PRINT);
	}

	/**
	 * @param value
	 */
	@Override
	public void printValue(final Object value) {
		// call method `printInteger` and pass argument parameter constant `value` of type `Object`
		this.printInteger((Integer) value);
	}

}
