package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json;

import org.json.JsonObject;

public interface JsonObjectHolderFactory {
    void initialize(JsonObject object);
    JsonObjectHolder createJsonObjectHolder();
}