package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.stream;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.Pipeline;

public class ActionPipeline<T> implements Pipeline<T, T> {
	private final Consumer<T> consumer;
	ActionPipeline(Consumer<T> consumer) {
		this.consumer = consumer;
	}

	public static <T, R> Pipeline<T, R> of(Consumer<T, R> consumer) {
		return new ActionPipeline<>(consumer);
	}

	public R run(T value) {
		this.consumer.accept(value);
		return value;
	}
}