package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.resources.ResourceProvider;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturnerFactory implements StringStringReturnerFactory {

    private final ResourceProvider resourceProvider;

    public BuzzStringReturnerFactory(ResourceProvider resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    @Override
	public StringStringReturner createStringStringReturner() {
		final BuzzStringReturner myBuzzStringReturner = new BuzzStringReturner(resourceProvider);
		return myBuzzStringReturner;
	}

}
