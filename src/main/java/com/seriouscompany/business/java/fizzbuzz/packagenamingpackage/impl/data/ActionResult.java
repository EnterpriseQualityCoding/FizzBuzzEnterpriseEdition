package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

/**
 * Result for Action
 */
public class ActionResult<T> implements Reslut<T> {
	private T result;
	public T getResult() {
		return this.result;
	}
    public void setResult(T result) {
		this.result = result;
	}
}
