package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.json;

import org.json.JsonObject;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonObjectHolder;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonObjectAccessor;

public class JsonObjectHolderImpl implements JsonObjectHolder {
	private final JsonObject jsonObject;

	public JsonObjectHolderImpl(JsonObject jsonObject) {
		this.jsonObject = jsonObject;
	}

	public JsonObjectAccessor getJsonObjectAccessor() {
		return new JsonObjectAccessor(this.jsonObject);
	}
}