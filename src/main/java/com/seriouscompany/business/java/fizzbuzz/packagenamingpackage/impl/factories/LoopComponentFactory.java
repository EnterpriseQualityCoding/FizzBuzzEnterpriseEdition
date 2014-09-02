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
	
	public LoopInitializer createLoopInitializer(int nLoopInitialValue) {
		final LoopInitializer myLoopInitializer = new LoopInitializer(nLoopInitialValue);
		return myLoopInitializer;
	}
	
	public LoopFinalizer createLoopFinalizer(int nLoopFinalValue) {
		final LoopFinalizer myLoopFinalizer = new LoopFinalizer(nLoopFinalValue);
		return myLoopFinalizer;
	}

	public LoopStep createLoopStep(int nLoopStepValue) {
		final LoopStep myLoopStep = new LoopStep(nLoopStepValue);
		return myLoopStep;
	}
}
