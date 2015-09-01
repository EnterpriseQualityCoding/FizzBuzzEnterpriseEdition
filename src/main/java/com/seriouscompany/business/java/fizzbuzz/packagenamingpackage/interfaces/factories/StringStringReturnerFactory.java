package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

import javax.annotation.Nonnull;

public interface StringStringReturnerFactory {

	@Nonnull
	public StringStringReturner createStringStringReturner();
	
}
