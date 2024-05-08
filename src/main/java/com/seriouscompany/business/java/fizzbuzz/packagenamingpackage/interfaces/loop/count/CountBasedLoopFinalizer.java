package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

/**
 * LoopFinalizer
 */
public final class LoopFinalizer {

	private final int nStoredLoopFinalValue;

	/**
	 * @param nLoopFinalValue int
	 */
	public LoopFinalizer(final int nLoopFinalValue) {
		super();
		this.nStoredLoopFinalValue = nLoopFinalValue;
	}

	/**
	 * @return int
	 */
	public int getLoopFinalizationPoint() {
		return this.nStoredLoopFinalValue;
	}

}
