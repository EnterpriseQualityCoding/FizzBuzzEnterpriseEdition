package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.CountBasedLoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.CountBasedLoopFinalizer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.CountBasedLoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.CountBasedLoopStep;

/**
 * Factory for CountBasedLoopComponent
 */
@Service
public class CountBasedLoopComponentFactory implements LoopComponentFactory {

	private final CountBasedLoopCondition _loopCondition;

	private final CountBasedLoopInitializer _loopInitializer;

	private final CountBasedLoopStep _loopStep;

	/**
	 * @param _loopCondition CountBasedLoopCondition
	 * @param _loopInitializer CountBasedLoopInitializer
	 * @param _loopStep CountBasedLoopStep
	 */
	@Autowired
	public CountBasedLoopComponentFactory(final CountBasedLoopCondition _loopCondition, final CountBasedLoopInitializer _loopInitializer,
			final CountBasedLoopStep _loopStep) {
		super();
		this._loopCondition = _loopCondition;
		this._loopInitializer = _loopInitializer;
		this._loopStep = _loopStep;
	}

	/**
	 * @return CountBasedLoopCondition
	 */
	public CountBasedLoopCondition createLoopCondition() {
		return this._loopCondition;
	}

	/**
	 * @return CountBasedLoopInitializer
	 */
	public CountBasedLoopInitializer createLoopInitializer() {
		return this._loopInitializer;
	}

	/**
	 * @param nCountBasedLoopFinalValue int
	 * @return CountBasedLoopFinalizer
	 */
	public CountBasedLoopFinalizer createLoopFinalizer(final int nLoopFinalValue) {
		final CountBasedLoopFinalizer myCountBasedLoopFinalizer = new CountBasedLoopFinalizer(nLoopFinalValue);
		return myCountBasedLoopFinalizer;
	}

	/**
	 * @return CountBasedLoopStep
	 */
	public CountBasedLoopStep createLoopStep() {
		return this._loopStep;
	}

}
