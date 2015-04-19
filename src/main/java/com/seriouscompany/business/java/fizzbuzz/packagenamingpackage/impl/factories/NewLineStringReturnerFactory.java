package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

@Service
public class NewLineStringReturnerFactory implements
		StringStringReturnerFactory {

	@Autowired
	private NewLineStringReturner _newlineStringReturner;
	
	@Override
	public StringStringReturner createStringStringReturner() {
		return _newlineStringReturner;
	}

}
