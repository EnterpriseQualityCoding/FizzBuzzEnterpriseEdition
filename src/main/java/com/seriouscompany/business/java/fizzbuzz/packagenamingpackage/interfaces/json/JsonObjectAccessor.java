package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json;

import org.json.JsonObject;

public interface JsonObjectAccessor {
    JsonObjectHasKeyVerifier getHasKeyVerifier(JsonObjectKey jsonObjectKey);
    JsonObjectKeyReader getKeyReader(JsonObjectKey jsonObjectKey);
}