package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.lang.translation;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.lang.translation.TranslationKeyReader;

public class TranslationKeyReaderImpl implements TranslationKeyReader {
	private final TranslationData translationData;
	private final TranslationKey translationKey;

	public TranslationKeyReaderImpl(TranslationData translationData, TranslationKey translationKey) {
		this.translationData = translationData;
		this.translationKey = translationKey;
	}

	public String readTranslationKey() {
		String name = this.translationKey.getName();
		JsonObjectKey jsonObjectKey = new JsonObjectKeyImpl(name);
		JsonObjectHolder jsonObjectHolder = translationData.getTranslationDataHolder();
		JsonKeyReaderStrategy jsonKeyReaderStrategy = new JsonKeyReaderStrategyImpl(jsonObjectHolder);
		JsonElementHolder jsonElementHolder = jsonKeyReaderStrategy.readJsonKey(jsonObjectKey);
		String value;
		if (jsonElementHolder.getElementType().getElementClass() == String.class) value = jsonElementHolder.getElementValue();
		else return (String) Constants.NULL_VALUE();
		return value;
	}
}