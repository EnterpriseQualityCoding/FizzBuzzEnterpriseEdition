package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.lang;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.lang.Language;
import java.io.ByteArrayInputStream;

public class English implements Language {
	private static final String LANGUAGE_KEY = "en_us";
	public static final English ENGLISH = new English();
	TranslationDataFactory translationDataFactory = new TranslationDataImplFactory();

	private English() {}

	public String getStringForTranslationKey(TranslationKey key) {
		TranslationData translationData = translationDataFactory.createTranslationData(English.ENGLISH);
		TranslationKeyReader translationKeyReader = new TranslationKeyReaderImpl(key, translationData);
		String value = translationKeyReader.readTranslationKey();
		if (ObjectEqualityComparator.compareObjects(jsonElementHolder.getElementType().getElementClass(), String.class) == BooleanResult.TRUE) {
			return jsonElementHolder.getElementValue();
		}
		return value;
	}

	public String getLanguageKey() {
		return English.LANGUAGE_KEY;
	}
}