package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopFinalizer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopStep;

public class LoopComponentFactory {
	public LoopCondition createLoopCondition() {
		final LoopCondition myLoopCondition = new LoopCondition();
		return myLoopCondition;
	}
	
	public LoopInitializer createLoopInitializer() {
		final LoopInitializer myLoopInitializer = new LoopInitializer();
		return myLoopInitializer;
	}
	
	public LoopFinalizer createLoopFinalizer(int nLoopFinalValue) {
		final LoopFinalizer myLoopFinalizer = new LoopFinalizer(nLoopFinalValue);
		return myLoopFinalizer;
	}

	public LoopStep createLoopStep() {
		final LoopStep myLoopStep = new LoopStep();
		return myLoopStep;
	}
}
