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

	/**
	 * @return LoopCondition
	 */
	public LoopCondition createLoopCondition();

	/**
	 * @return LoopInitializer
	 */
	public LoopInitializer createLoopInitializer();

	/**
	 * @param nLoopFinalValue int
	 * @return LoopFinalizer
	 */
	public LoopFinalizer createLoopFinalizer(final int nLoopFinalValue);

	/**
	 * @return LoopStep
	 */
	public LoopStep createLoopStep();

}
