package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.i18n;

import java.util.Locale;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.i18n.LocaleProvider;

public class LocaleManager {

    private static final LocaleManager INSTANCE = new LocaleManager();

    private LocaleProvider _provider = new SingleLocaleProvider(Locale.ENGLISH);

    public static LocaleManager getInstance() { return INSTANCE; }

    public synchronized void setLocale(Locale lc) {
        _provider = new SingleLocaleProvider(lc);
    }

    public synchronized Locale getLocale() {
        return _provider.getLocale();
    }
}
