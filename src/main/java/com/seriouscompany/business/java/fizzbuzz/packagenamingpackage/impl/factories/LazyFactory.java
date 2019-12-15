package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.caching.LazilyComputedValue;
import java.util.function.Supplier;
import org.springframework.stereotype.Service;

@Service
public class LazyFactory {

	public <T> LazilyComputedValue<T> createLazy(Supplier<T> lazyValueComputationFunction) {
		return new LazilyComputedValue<>(lazyValueComputationFunction);
	}

}
