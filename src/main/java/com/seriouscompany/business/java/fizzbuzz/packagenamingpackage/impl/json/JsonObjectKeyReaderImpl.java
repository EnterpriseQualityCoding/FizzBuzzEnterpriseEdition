package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.json;

import org.json.JsonObject;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonObjectKey;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonObjectKeyReader;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonElementHolder;

public class JsonObjectKeyReaderImpl implements JsonObjectKeyReader {
	private final JsonObject jsonObject;
	private final JsonObjectKey jsonObjectKey;

	private static final JsonObjectHolderFactory jsonObjectHolderFactory = new JsonObjectHolderImplFactory();
	
	public JsonObjectKeyReaderImpl(JsonObject jsonObject, JsonObjectKey jsonObjectKey) {
		this.jsonObject = jsonObject;
		this.jsonObjectKey = jsonObjectKey;
	}

	public JsonElementHolder readKey() {
		String jsonObjectKeyName = this.jsonObjectKey.getName();
		Object value = this.jsonObject.get(jsonObjectKeyName);
		if (value instanceof JsonObject jsonObjectValue) return new JsonElementHolder(
			jsonObjectHolderFactory.createJsonObjectHolder(jsonObjectValue),
			JsonElementTypeImpl.JSON_OBJECT_HOLDER
		);
		if (value instanceof String stringValue) return new JsonElementHolder(
			stringValue, JsonElementTypeImpl.JSON_STRING
		);
		return (JsonElementHolder) Constants.NULL_VALUE();
	}
}