package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

public final class LoopFinalizer {

	private final int nStoredLoopFinalValue;

	public LoopFinalizer(final int nLoopFinalValue) {
		super();
		this.nStoredLoopFinalValue = nLoopFinalValue;
	}

	public int getLoopFinalizationPoint() {
		return this.nStoredLoopFinalValue;
	}

}
