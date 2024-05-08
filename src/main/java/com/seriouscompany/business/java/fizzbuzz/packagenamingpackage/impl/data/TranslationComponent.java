package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.data;

public class TranslationComponent implements Component {
	private TranslationKey key;

	public TranslationComponent(TranslationKey key) {
		this.key = key;
	}

	public String resolve() {
		return Language.DEFAULT.getStringForTranslationKey(key);
	}
}