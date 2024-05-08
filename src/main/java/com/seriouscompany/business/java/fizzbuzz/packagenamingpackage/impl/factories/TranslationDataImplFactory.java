package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.TranslationDataFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.lang.translation.TranslationData;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.lang.translation.TranslationDataImpl;
/**
 * Factory for TranslationDataImpl
 */
public class TranslationDataImplFactory implements TranslationDataFactory {

	/**
	 * @return TranslationData
	 */
	public TranslationData createTranslationData(Language language) {
        return new TranslationDataImpl(language);
    }

}
