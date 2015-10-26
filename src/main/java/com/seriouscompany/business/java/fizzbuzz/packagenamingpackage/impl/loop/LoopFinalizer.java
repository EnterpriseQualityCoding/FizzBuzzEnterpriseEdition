package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

public class LoopFinalizer {

	private final int nStoredLoopFinalValue;

	public LoopFinalizer(int nLoopFinalValue) {
		nStoredLoopFinalValue = nLoopFinalValue;
	}

	public int getLoopFinalizationPoint() {
		return nStoredLoopFinalValue;
	}
}

