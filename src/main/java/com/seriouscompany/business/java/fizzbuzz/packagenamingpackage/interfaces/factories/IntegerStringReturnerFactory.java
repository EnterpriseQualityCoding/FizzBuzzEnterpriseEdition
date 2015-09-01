package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

import javax.annotation.Nonnull;

public interface IntegerStringReturnerFactory {
	@Nonnull
	public IntegerStringReturner createIntegerStringReturner();
	
}
