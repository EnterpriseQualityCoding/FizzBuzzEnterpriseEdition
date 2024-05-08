package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.stream;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.Pipeline;

public abstract class MergedPipeline<T, R> implements Pipeline<T, R> {
	AbstractPipeline() {
	}

	public <N> Pipeline<T, N> next(Pipeline<R, N> nextPipeline) {
		return new MergedPipeline<>(this, nextPipeline);
	}
	public abstract R run(T value);
	public Stream<R> run(Stream<T> valueStream) {
		return valueStream.map(this::run);
	}
}