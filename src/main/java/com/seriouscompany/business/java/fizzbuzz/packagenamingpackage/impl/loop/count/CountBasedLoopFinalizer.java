package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopFinalizer;

/**
 * Count-based LoopFinalizer
 */
public final class CountBasedLoopFinalizer implements LoopFinalizer {

	private final int nStoredLoopFinalValue;

	/**
	 * @param nLoopFinalValue int
	 */
	public CountBasedLoopFinalizer(final int nLoopFinalValue) {
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
