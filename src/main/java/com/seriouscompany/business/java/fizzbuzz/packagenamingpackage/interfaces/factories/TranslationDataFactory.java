package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.lang.translation.TranslationData;

/**
 * Factory for TranslationData
 */
public interface TranslationDataFactory {

	/**
	 * @return TranslationData
	 */
	public TranslationData createTranslationData(Language language);

}
