package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.lang.translation;

public interface Language {
    TranslationKey getNameTranslationKey();
    String getStringForTranslationKey(TranslationKey key);
}