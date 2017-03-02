package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

/**
 * Factory for IntegerIntegerStringReturner
 */
@Service
public class IntegerIntegerStringReturnerFactory implements
		IntegerStringReturnerFactory {

	private final IntegerIntegerStringReturner _integerIntegerStringReturner;

	/**
	 * @param _integerIntegerStringReturner IntegerIntegerStringReturner
	 */
	@Autowired
	public IntegerIntegerStringReturnerFactory(final IntegerIntegerStringReturner _integerIntegerStringReturner) {
		super();
		this._integerIntegerStringReturner = _integerIntegerStringReturner;
	}

	/**
	 * @return IntegerStringReturner
	 */
	@Override
	public IntegerStringReturner createIntegerStringReturner() {
		return this._integerIntegerStringReturner;
	}

}
