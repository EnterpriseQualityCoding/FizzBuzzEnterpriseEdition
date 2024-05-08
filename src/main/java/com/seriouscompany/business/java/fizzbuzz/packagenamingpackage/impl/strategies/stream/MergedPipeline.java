package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.stream;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.Pipeline;

public class MergedPipeline<T, U, R> extends AbstractPipeline<T, R> {
	private final Pipeline<T, U> first;
	private final Pipeline<U, R> second;
	MergedPipeline(Pipeline<T, U> first, Pipeline<U, R> second) {
		this.first = first;
		this.second = second;
	}

	public R run(T value) {
		U next = first.run(value);
		R last = second.run(next);
		return last;
	}
}