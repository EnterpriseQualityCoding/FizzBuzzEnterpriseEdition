package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

public class LoopStep {

    public LoopStep(final int loopIncValue) {
        this.loopIncValue = loopIncValue;
    }

    public int stepLoop(int nCurrentNumber) {
        return nCurrentNumber + loopIncValue;
    }

    private final int loopIncValue;
}
