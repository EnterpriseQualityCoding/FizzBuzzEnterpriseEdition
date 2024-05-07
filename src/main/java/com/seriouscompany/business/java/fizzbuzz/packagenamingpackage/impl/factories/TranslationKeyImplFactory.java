package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.TranslationKeyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.lang.translation.TranslationKey;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.lang.translation.TranslationKeyImpl;

/**
 * Factory for TranslationKeyImpl
 */
public class TranslationKeyImplFactory implements TranslationKeyFactory {

	/**
	 * @return TranslationKey
	 */
	public TranslationKey createTranslationKey(String string) {
        return new TranslationKeyImpl(string);
    }

}
