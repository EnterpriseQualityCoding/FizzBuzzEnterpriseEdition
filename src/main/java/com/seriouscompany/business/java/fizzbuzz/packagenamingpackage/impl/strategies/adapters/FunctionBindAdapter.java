package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

public class FunctionBindAdapter {
    private FunctionBindAdapter() {}

    public static <T, U, R> Function<U, R> bindFirst(BiFunction<T, U, R> biFunction, T t) {
        return u -> biFunction.apply(t, u);
    }

    public static <T, U, R> Function<T, R> bindSecond(BiFunction<T, U, R> biFunction, U u) {
        return t -> biFunction.apply(u, t);
    }
}