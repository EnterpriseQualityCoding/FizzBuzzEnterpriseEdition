package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.resources.ResourceProvider;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturnerFactory implements StringStringReturnerFactory {

    private final ResourceProvider resourceProvider;

    public FizzStringReturnerFactory(ResourceProvider resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    @Override
	public StringStringReturner createStringStringReturner() {
		final FizzStringReturner myFizzStringReturner = new FizzStringReturner(resourceProvider);
		return myFizzStringReturner;
	}

}
