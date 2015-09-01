package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

import javax.annotation.Nonnull;

@Service
public class FizzStringReturnerFactory implements StringStringReturnerFactory {

	@Nonnull
	private final FizzStringReturner _fizzStringReturner;

	@Autowired
	public FizzStringReturnerFactory(@Nonnull final FizzStringReturner _fizzStringReturner) {
		this._fizzStringReturner = _fizzStringReturner;
	}

	@Nonnull
	@Override
	public StringStringReturner createStringStringReturner() {
		return this._fizzStringReturner;
	}

}
