// BuzzStringReturnerFactory.java
// Factory for BuzzStringReturner

// add to package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

// imports org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Autowired;
// imports org.springframework.stereotype.Service
import org.springframework.stereotype.Service;

// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
// imports com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * Factory for BuzzStringReturner
 */
@Service
public class BuzzStringReturnerFactory implements StringStringReturnerFactory {

	// create a private constant the uses BuzzStringReturner called `_myBuzzStringReturner`
	private final BuzzStringReturner _myBuzzStringReturner;

	/**
	 * @param _myBuzzStringReturner BuzzStringReturner
	 */
	@Autowired
	// create a constructor that take a constant final parameter called `_myBuzzStringReturner` of type BuzzStringReturner
	public BuzzStringReturnerFactory(final BuzzStringReturner _myBuzzStringReturner) {
		// create a quick pointer `super` thing to access the accessor from the accessor method of the accessed object
		super();
		// set attribute `_myBuzzStringReturner` to parameter constant `_myBuzzStringReturner`
		this._myBuzzStringReturner = _myBuzzStringReturner;
	}

	/**
	 * @return StringStringReturner
	 */
	@Override
	public StringStringReturner createStringStringReturner() {
		// return attribute `_myBuzzStringReturner`
		return this._myBuzzStringReturner;
	}

}
