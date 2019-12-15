package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.caching;

import java.util.function.Supplier;

public class LazilyComputedValue<T> {

    private final Object lockForValueComputation = new Object();
	private volatile Supplier<T> lazyValueComputationFunction;
	private T lazilyComputedValue;

	public LazilyComputedValue(Supplier<T> lazyValueComputationFunction) {
		this.lazyValueComputationFunction = lazyValueComputationFunction;
	}

	public T getLazilyComputedValue() {
	    if (lazyValueComputationFunction != null) {
	        synchronized (lockForValueComputation) {
	            if (lazyValueComputationFunction != null) {
	                lazilyComputedValue = lazyValueComputationFunction.get();
	                lazyValueComputationFunction = null;
	                return lazilyComputedValue;
                }
            }
        }
	    return lazilyComputedValue;
    }
}
