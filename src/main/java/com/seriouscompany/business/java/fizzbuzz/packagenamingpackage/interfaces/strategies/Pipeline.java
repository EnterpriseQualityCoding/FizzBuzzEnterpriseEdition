package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies;

public interface Pipeline<T, R> {
	public <N> Pipeline<T, N> next(Pipeline<R, N> nextPipeline);
	public R run(T value);
	public Stream<R> run(Stream<T> valueStream);
}