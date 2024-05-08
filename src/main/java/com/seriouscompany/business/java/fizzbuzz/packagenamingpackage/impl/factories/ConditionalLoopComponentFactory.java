package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.ConditionalLoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.ConditionalLoopFinalizer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.ConditionalLoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.ConditionalLoopStep;

/**
 * Factory for ConditionalLoopComponent
 */
@Service
public class ConditionalLoopComponentFactory implements LoopComponentFactory {

	private final ConditionalLoopCondition _loopCondition;

	private final ConditionalLoopInitializer _loopInitializer;

	private final ConditionalLoopStep _loopStep;

	/**
	 * @param _loopCondition ConditionalLoopCondition
	 * @param _loopInitializer ConditionalLoopInitializer
	 * @param _loopStep ConditionalLoopStep
	 */
	@Autowired
	public ConditionalLoopComponentFactory(final ConditionalLoopCondition _loopCondition, final ConditionalLoopInitializer _loopInitializer,
			final ConditionalLoopStep _loopStep) {
		super();
		this._loopCondition = _loopCondition;
		this._loopInitializer = _loopInitializer;
		this._loopStep = _loopStep;
	}

	/**
	 * @return ConditionalLoopCondition
	 */
	public ConditionalLoopCondition createLoopCondition() {
		return this._loopCondition;
	}

	/**
	 * @return ConditionalLoopInitializer
	 */
	public ConditionalLoopInitializer createLoopInitializer() {
		return this._loopInitializer;
	}

	/**
	 * @param nConditionalLoopFinalValue int
	 * @return ConditionalLoopFinalizer
	 */
	public ConditionalLoopFinalizer createLoopFinalizer(final int nLoopFinalValue) {
		final ConditionalLoopFinalizer myConditionalLoopFinalizer = new ConditionalLoopFinalizer();
		return myConditionalLoopFinalizer;
	}

	/**
	 * @return ConditionalLoopStep
	 */
	public ConditionalLoopStep createLoopStep() {
		return this._loopStep;
	}

}
