package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.generators;

public interface IntegerGenerator<T extends Integer> extends Generator<T> {
    public T get();
    public int getAsInt();
}