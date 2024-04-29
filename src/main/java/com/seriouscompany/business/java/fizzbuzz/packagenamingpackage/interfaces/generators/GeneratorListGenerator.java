package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.generators;

public interface GeneratorListGenerator<E, G extends Generator<E>, L extends GeneratorList<E, G>> extends ListGenerator<L> {
    public L get();
}