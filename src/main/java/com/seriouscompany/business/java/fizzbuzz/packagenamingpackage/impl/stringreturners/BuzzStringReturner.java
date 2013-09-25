package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.i18n.LocaleManager;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.i18n.LocalizedStringProvider;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturner implements StringStringReturner, LocalizedStringProvider {

	@Override
    public String getReturnString() {
		StringBuilder myStringBuilder = new StringBuilder(getLocalizedString());
		String myString = myStringBuilder.toString();
		return new String(myString);
	}

    @Override
    public String getLocalizedString() {
        ResourceBundle rb = ResourceBundle.getBundle("strings", LocaleManager.getInstance().getLocale(), Thread.currentThread().getContextClassLoader());
        return rb.getString("buzz");
    }
}
