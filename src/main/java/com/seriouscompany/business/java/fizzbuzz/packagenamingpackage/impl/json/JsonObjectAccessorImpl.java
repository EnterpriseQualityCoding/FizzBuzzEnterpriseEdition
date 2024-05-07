package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.json;

import org.json.JsonObject;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonObjectAccessor;

public class JsonObjectAccessorImpl implements JsonObjectAccessor {
    private final JsonObject jsonObject;

    public JsonObjectAccessorImpl(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JsonObjectHasKeyVerifier getHasKeyVerifier(JsonObjectKey jsonObjectKey) {
        return new JsonObjectHasKeyVerifierImpl(jsonObject, jsonObjectKey);
    }
    public JsonObjectKeyReader getKeyReader(JsonObjectKey jsonObjectKey) {
        return new JsonObjectKeyReaderImpl(jsonObject, jsonObjectKey);
    }
}