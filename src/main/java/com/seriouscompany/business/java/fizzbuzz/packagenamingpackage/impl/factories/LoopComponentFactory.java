package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopFinalizer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopStep;

/**
 * Factory for LoopComponent
 */
@Service
public class LoopComponentFactory {

	private final LoopCondition _loopCondition;

	private final LoopInitializer _loopInitializer;

	private final LoopStep _loopStep;

	/**
	 * @param _loopCondition LoopCondition
	 * @param _loopInitializer LoopInitializer
	 * @param _loopStep LoopStep
	 */
	@Autowired
	public LoopComponentFactory(final LoopCondition _loopCondition, final LoopInitializer _loopInitializer,
			final LoopStep _loopStep) {
		super();
		this._loopCondition = _loopCondition;
		this._loopInitializer = _loopInitializer;
		this._loopStep = _loopStep;
	}

	/**
	 * @return LoopCondition
	 */
	public LoopCondition createLoopCondition() {
		return this._loopCondition;
	}

	/**
	 * @return LoopInitializer
	 */
	public LoopInitializer createLoopInitializer() {
		return this._loopInitializer;
	}

	/**
	 * @param nLoopFinalValue int
	 * @return LoopFinalizer
	 */
	public LoopFinalizer createLoopFinalizer(final int nLoopFinalValue) {
		final LoopFinalizer myLoopFinalizer = new LoopFinalizer(nLoopFinalValue);
		return myLoopFinalizer;
	}

	/**
	 * @return LoopStep
	 */
	public LoopStep createLoopStep() {
		return this._loopStep;
	}

}
