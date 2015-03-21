package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

@Service
public class IntegerIntegerStringReturnerFactory implements
		IntegerStringReturnerFactory {

	@Autowired
	private IntegerIntegerStringReturner _integerIntegerStringReturner;
	
	@Override
	public IntegerStringReturner createIntegerStringReturner() {
		return _integerIntegerStringReturner;
	}

}
