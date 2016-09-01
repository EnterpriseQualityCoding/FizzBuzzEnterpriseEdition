package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopFinalizer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopStep;

@Service
public class LoopComponentFactory {

	private final LoopCondition _loopCondition;

	private final LoopInitializer _loopInitializer;

	private final LoopStep _loopStep;

	@Autowired
	public LoopComponentFactory(final LoopCondition _loopCondition, final LoopInitializer _loopInitializer,
			final LoopStep _loopStep) {
		super();
		this._loopCondition = _loopCondition;
		this._loopInitializer = _loopInitializer;
		this._loopStep = _loopStep;
	}

	public LoopCondition createLoopCondition() {
		return this._loopCondition;
	}

	public LoopInitializer createLoopInitializer() {
		return this._loopInitializer;
	}

	public LoopFinalizer createLoopFinalizer(final int nLoopFinalValue) {
		final LoopFinalizer myLoopFinalizer = new LoopFinalizer(nLoopFinalValue);
		return myLoopFinalizer;
	}

	public LoopStep createLoopStep() {
		return this._loopStep;
	}

}
