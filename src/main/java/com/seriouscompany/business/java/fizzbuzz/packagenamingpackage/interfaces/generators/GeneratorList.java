package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.generators;

public interface GeneratorList<E, G extends Generator<T>> extends List<G> {
    public List<E> getList();
    
}