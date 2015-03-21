package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class BuzzStringReturnerFactory implements StringStringReturnerFactory {

	@Autowired
	private BuzzStringReturner _myBuzzStringReturner;
	
	@Override
	public StringStringReturner createStringStringReturner() {
		return _myBuzzStringReturner;
	}
}
