package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.lang;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.lang.English;

public interface Language {
    public static final Language DEFAULT = English.ENGLISH;
    String getStringForTranslationKey(TranslationKey key);
    String getLanguageKey();
}