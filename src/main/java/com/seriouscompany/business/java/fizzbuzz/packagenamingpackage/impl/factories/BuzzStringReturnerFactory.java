package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * Factory for BuzzStringReturner
 */
@Service
public class BuzzStringReturnerFactory implements StringStringReturnerFactory {

	private final BuzzStringReturner _myBuzzStringReturner;

	/**
	 * @param _myBuzzStringReturner BuzzStringReturner
	 */
	@Autowired
	public BuzzStringReturnerFactory(final BuzzStringReturner _myBuzzStringReturner) {
		super();
		this._myBuzzStringReturner = _myBuzzStringReturner;
	}

	/**
	 * @return StringStringReturner
	 */
	@Override
	public StringStringReturner createStringStringReturner() {
		return this._myBuzzStringReturner;
	}

}
