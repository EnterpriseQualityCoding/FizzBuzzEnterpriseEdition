package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class FizzStringReturnerFactory implements StringStringReturnerFactory {

	private final FizzStringReturner _fizzStringReturner;

	@Autowired
	public FizzStringReturnerFactory(final FizzStringReturner _fizzStringReturner) {
		this._fizzStringReturner = _fizzStringReturner;
	}

	@Override
	public StringStringReturner createStringStringReturner() {
		return this._fizzStringReturner;
	}

}
