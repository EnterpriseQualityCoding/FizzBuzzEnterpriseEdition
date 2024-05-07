package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.json;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonElementHolder;

public class JsonElementHolderImpl<E extends JsonElement> implements JsonElementHolder {
    private final E elementValue;
    private final JsonElementType<E> elementType;

    public JsonElementHolderImpl(E elementValue, JsonElementType<E> elementType) {
        this.elementValue = elementValue;
        this.elementType = elementType;
    }

    public E getElementValue() {
        return this.elementValue;
    }
    public JsonElementType<E> getElementType() {
        return this.elementType
    }
}