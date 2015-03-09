package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.resources.ResourceProvider;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturner implements StringStringReturner {

    private final ResourceProvider resourceProvider;

    public BuzzStringReturner(ResourceProvider resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder(resourceProvider.getBuzz());
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}
	
}
