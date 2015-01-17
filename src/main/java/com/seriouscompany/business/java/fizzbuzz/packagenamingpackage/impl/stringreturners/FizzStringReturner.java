package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzModelFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.ModelFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.models.Model;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturner implements StringStringReturner {

	public String getReturnString() {
		final ModelFactory factory = new FizzModelFactory();
		final Model model = factory.createModel();
		final StringBuilder myStringBuilder = new StringBuilder(model.getValue());
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
