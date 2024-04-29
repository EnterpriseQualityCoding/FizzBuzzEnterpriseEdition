package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.generators;

public interface StringGenerator<T extends String> extends Generator<T> {
    public T get();
}