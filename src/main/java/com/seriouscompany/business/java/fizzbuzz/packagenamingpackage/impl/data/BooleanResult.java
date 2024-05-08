package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.data;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * Result for Boolean
 */
public enum BooleanResult {
    TRUE,
    FALSE;

    public static Function<T, BooleanResult> from(Predicate<T> predicate) {
        return t -> predicate.test(t) ? BooleanResult.TRUE : BooleanResult.FALSE;
    }
    public static BiFunction<T, BooleanResult> from(BiPredicate<T> predicate) {
        return (t, u) -> predicate.test(t, u) ? BooleanResult.TRUE : BooleanResult.FALSE;
    }
}