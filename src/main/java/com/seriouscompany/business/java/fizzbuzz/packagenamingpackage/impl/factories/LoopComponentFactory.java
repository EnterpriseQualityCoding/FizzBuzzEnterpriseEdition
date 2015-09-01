package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopFinalizer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopStep;

import javax.annotation.Nonnull;

@Service
public class LoopComponentFactory {

	@Nonnull
	private final LoopCondition _loopCondition;

	@Nonnull
	private final LoopInitializer _loopInitializer;

	@Nonnull
	private final LoopStep _loopStep;

	@Autowired
	public LoopComponentFactory(@Nonnull final LoopCondition _loopCondition, @Nonnull final LoopInitializer _loopInitializer,
								@Nonnull final LoopStep _loopStep) {
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
