package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.JsonKeyReaderStrategy;

public class JsonKeyReaderStrategyImpl implements JsonKeyReaderStrategy {
	private final JsonObjectHolder jsonObjectHolder;
	
	public JsonKeyReaderStrategyImpl(JsonObjectHolder jsonObjectHolder) {
		this.jsonObjectHolder = jsonObjectHolder;
	}

	public JsonElementHolder readJsonKey(JsonObjectKey key) {
		JsonObjectAccessor jsonObjectAccessor = this.jsonObjectHolder.getJsonObjectAccessor();
		JsonObjectHasKeyVerifier jsonObjectHasKeyVerifier = jsonObjectAccessor.getHasKeyVerifier(key);
		if (jsonObjectHasKeyVerifier.verifyJsonObjectHasKey() == BooleanResult.TRUE) {
			JsonObjectKeyReader jsonObjectKeyReader = jsonObjectAccessor.getKeyReader(key);
			JsonElementHolder jsonElementHolder = jsonObjectKeyReader.readKey();
			return jsonElementHolder;
		} else {
			throw Constants.KEY_NOT_FOUND.apply(Language.DEFAULT).createException();
		}
	}
}