package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.lang.translation.TranslationKey;

/**
 * Factory for TranslationKey
 */
public interface TranslationKeyFactory {

	/**
	 * @return TranslationKey
	 */
	public TranslationKey createTranslationKey(String string);

}
