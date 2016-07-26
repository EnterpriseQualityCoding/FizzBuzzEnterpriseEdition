package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

@Service
public class IntegerIntegerStringReturnerFactory implements
		IntegerStringReturnerFactory {

	private final IntegerIntegerStringReturner _integerIntegerStringReturner;

	@Autowired
	public IntegerIntegerStringReturnerFactory(final IntegerIntegerStringReturner _integerIntegerStringReturner) {
		super();
		this._integerIntegerStringReturner = _integerIntegerStringReturner;
	}

	@Override
	public IntegerStringReturner createIntegerStringReturner() {
		return this._integerIntegerStringReturner;
	}

}
