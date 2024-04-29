package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json;

public interface JsonElementHolder<E extends JsonElement> {
    E getElement();
    JsonElementType<E> getType();
}