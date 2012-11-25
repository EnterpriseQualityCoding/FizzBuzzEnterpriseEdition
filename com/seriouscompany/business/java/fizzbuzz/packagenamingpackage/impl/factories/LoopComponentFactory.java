package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopStep;

public class LoopComponentFactory {
	public LoopCondition createLoopCondition() {
		LoopCondition myLoopCondition = new LoopCondition();
		return myLoopCondition;
	}
	
	public LoopInitializer createLoopInitializer() {
		LoopInitializer myLoopInitializer = new LoopInitializer();
		return myLoopInitializer;
	}
	
	public LoopStep createLoopStep() {
		LoopStep myLoopStep = new LoopStep();
		return myLoopStep;
	}
}
