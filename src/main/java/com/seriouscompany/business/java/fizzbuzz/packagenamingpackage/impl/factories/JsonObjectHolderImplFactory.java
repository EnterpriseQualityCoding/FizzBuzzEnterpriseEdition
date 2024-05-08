package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.json;

import org.json.JsonObject;

public interface JsonObjectHolderImplFactory {
    public JsonObjectHolder createJsonObjectHolder(JsonObject jsonObject) {
        return new JsonObjectHolderImpl(jsonObject);
    }
}