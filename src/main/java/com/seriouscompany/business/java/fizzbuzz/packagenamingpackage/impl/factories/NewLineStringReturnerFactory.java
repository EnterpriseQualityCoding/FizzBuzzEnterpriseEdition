package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

import javax.annotation.Nonnull;

@Service
public class NewLineStringReturnerFactory implements
		StringStringReturnerFactory {

	@Nonnull
	private final NewLineStringReturner _newlineStringReturner;

	@Autowired
	public NewLineStringReturnerFactory(@Nonnull final NewLineStringReturner _newlineStringReturner) {
		this._newlineStringReturner = _newlineStringReturner;
	}

	@Nonnull
	@Override
	public StringStringReturner createStringStringReturner() {
		return this._newlineStringReturner;
	}

}
