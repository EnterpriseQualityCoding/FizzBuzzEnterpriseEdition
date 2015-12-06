package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

public final class LoopFinalizer {

	private final int nStoredLoopFinalValue;

	/**
	 * @param nLoopFinalValue
     */
	public LoopFinalizer(final int nLoopFinalValue) {
		this.nStoredLoopFinalValue = nLoopFinalValue;
	}

	/**
	 * @return int
     */
	public int getLoopFinalizationPoint() {
		return this.nStoredLoopFinalValue;
	}
}
