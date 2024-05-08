package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.json;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonElementType;

public class JsonElementTypeImpl implements JsonElementType {
    private final Class<E> elementClass;

    JsonElementTypeImpl(Class<E> elementClass) {
        this.elementClass = elementClass;
    }

    public Class<E> getElementClass() {
        return this.elementClass;
    }

    public static final JsonElementType<JsonObjectHolder> JSON_OBJECT_HOLDER = new JsonElementTypeImpl(JsonObjectHolder.class);
    public static final JsonElementType<String> JSON_STRING = new JsonElementTypeImpl(String.class);
}