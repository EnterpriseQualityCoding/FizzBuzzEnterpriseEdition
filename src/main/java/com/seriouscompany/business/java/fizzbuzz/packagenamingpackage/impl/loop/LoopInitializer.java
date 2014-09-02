package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

public class LoopInitializer {

    private final int nStoredLoopInitialValue;

    public LoopInitializer(int nLoopInitialValue) {
        nStoredLoopInitialValue = nLoopInitialValue;
    }

	public int getLoopInitializationPoint() {
		return nStoredLoopInitialValue;
	}
}
