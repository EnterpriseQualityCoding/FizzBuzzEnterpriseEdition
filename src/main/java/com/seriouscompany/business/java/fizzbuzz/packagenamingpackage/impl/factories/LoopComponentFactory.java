package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopFinalizer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopStep;

@Service
public class LoopComponentFactory {
	
	@Autowired
	LoopCondition _loopCondition;
	
	@Autowired
	LoopInitializer _loopInitializer;
	
	@Autowired
	LoopStep _lootStep;
	
	
	public LoopCondition createLoopCondition() {
		return _loopCondition;
	}
	
	public LoopInitializer createLoopInitializer() {
		return _loopInitializer;
	}
	
	public LoopFinalizer createLoopFinalizer(int nLoopFinalValue) {
		final LoopFinalizer myLoopFinalizer = new LoopFinalizer(nLoopFinalValue);
		return myLoopFinalizer;
	}

	public LoopStep createLoopStep() {
		return _lootStep;
	}
}
