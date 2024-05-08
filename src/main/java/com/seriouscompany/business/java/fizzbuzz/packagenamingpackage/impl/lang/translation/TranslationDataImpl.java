package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.lang.translation;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import org.json.JsonObject;
import org.json.JsonParserConfiguration;
import org.json.JsonTokener;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.FileContentReaderStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.lang.translation.TranslationData;

public class TranslationDataImpl implements TranslationData {
	private static final JsonObjectHolderFactory jsonObjectHolderFactory = new JsonObjectHolderImplFactory();
	private final Language language;
	public TranslationDataImpl(Language language) {
		this.language = language;
	}
	public JsonObjectHolder getTranslationDataHolder() {
		String languageKey = this.language.getLanguageKey();
		FileContentReaderStrategy fileContentReaderStrategy = new FileContentReaderStrategy();
		InputStream inputStream = fileContentReaderStrategy.getFileContents(Constants.ASSETS_LANG + languageKey);

		JsonLoader jsonLoader = new JsonLoaderImpl();
		jsonLoader.loadJson(inputStream);
		JsonReaderFactory jsonReaderFactory = jsonLoader.getJsonReaderFactory();
		JsonReader jsonReader = jsonReaderFactory.createJsonReader();
		JsonObjectHolder jsonObjectHolder = jsonReader.readJson();
		return jsonObjectHolder;
	}

	public static JsonObjectHolder getDefaultTranslations(JsonObjectHolder jsonObjectHolder) {
		JsonKeyReaderStrategy jsonKeyReaderStrategy = new JsonKeyReaderStrategyImpl(jsonObjectHolder);
		JsonObjectKey jsonObjectKey_translations = new JsonObjectKeyImpl(Constants.TRANSLATIONS);
		JsonElementHolder<JsonObjectHolder> jsonElementHolder_translations = (JsonElementHolder<JsonObjectHolder>) jsonKeyReaderStrategy.readJsonKey(jsonObjectKey_translations);
		JsonObjectHolder jsonObjectHolder_translations;
		if (jsonElementHolder_translations.getElementType().getElementClass() == JsonObjectHolder.class) jsonObjectHolder_translations = jsonElementHolder_translations.getElementValue();
		else return (JsonObjectHolder) Constants.NULL_VALUE();
		JsonKeyReaderStrategy jsonKeyReaderStrategy_translations = new JsonKeyReaderStrategyImpl(jsonObjectHolder_translations);
		JsonObjectKey jsonObjectKey_default = new JsonObjectKeyImpl(Constants.DEFAULT);
		JsonElementHolder<JsonObjectHolder> jsonElementHolder_default = (JsonElementHolder<JsonObjectHolder>) jsonKeyReaderStrategy_translations.readJsonKey(jsonObjectKey_default);
		JsonObjectHolder jsonObjectHolder_default;
		if (jsonElementHolder_default.getElementType().getElementClass() == JsonObjectHolder.class) jsonObjectHolder_default = jsonElementHolder_default.getElementValue();
		else return (JsonObjectHolder) Constants.NULL_VALUE();
		return jsonObjectHolder_default;
	}
}