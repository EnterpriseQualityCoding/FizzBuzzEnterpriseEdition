package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.i18n;

import java.util.Locale;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.i18n.LocaleProvider;

public class SingleLocaleProvider implements LocaleProvider {
    private final Locale _locale;

    public SingleLocaleProvider(Locale theLocale) {
        _locale = theLocale;
    }

    @Override
    public Locale getLocale() {
        return _locale;
    }
}
