package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

import javax.annotation.Nonnull;

@Service
public class BuzzStringReturnerFactory implements StringStringReturnerFactory {

	@Nonnull
	private final BuzzStringReturner _myBuzzStringReturner;

	@Autowired
	public BuzzStringReturnerFactory(@Nonnull final BuzzStringReturner _myBuzzStringReturner) {
		this._myBuzzStringReturner = _myBuzzStringReturner;
	}

	@Nonnull
	@Override
	public StringStringReturner createStringStringReturner() {
		return this._myBuzzStringReturner;
	}
}
