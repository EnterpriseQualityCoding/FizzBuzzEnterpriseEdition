package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.lang.translation;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.lang.translation.TranslationKey;

public class TranslationKeyImpl implements TranslationKey {
    private final String name;

    public TranslationKeyImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}