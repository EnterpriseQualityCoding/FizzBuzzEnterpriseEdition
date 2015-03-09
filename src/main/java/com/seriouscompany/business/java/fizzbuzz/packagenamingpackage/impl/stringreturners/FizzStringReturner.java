package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.resources.ResourceProvider;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturner implements StringStringReturner {

    private final ResourceProvider resourceProvider;

    public FizzStringReturner(ResourceProvider resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder(resourceProvider.getFizz());
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
