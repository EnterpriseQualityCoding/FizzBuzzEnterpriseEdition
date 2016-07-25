package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class NewLineStringReturnerFactory implements
		StringStringReturnerFactory {

	private final NewLineStringReturner _newlineStringReturner;

	@Autowired
	public NewLineStringReturnerFactory(final NewLineStringReturner _newlineStringReturner) {
		super();
		this._newlineStringReturner = _newlineStringReturner;
	}

	@Override
	public StringStringReturner createStringStringReturner() {
		return this._newlineStringReturner;
	}

}
