package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json;

public interface JsonElementHolder<E extends JsonElement> {
    E getElementValue();
    JsonElementType<E> getElementType();
}