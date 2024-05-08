package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.stream;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.Pipeline;

public class StandardPipeline<T, R> extends AbstractPipeline<T, R> {
	private final Function<T, R> function;
	private StandardPipeline(Function<T, R> function) {
		this.function = function;
	}

	public static <T, R> Pipeline<T, R> of(Function<T, R> function) {
		return new StandardPipeline<>(function);
	}

	public R run(T value) {
		R result = this.function.apply(value);
		return result;
	}
}