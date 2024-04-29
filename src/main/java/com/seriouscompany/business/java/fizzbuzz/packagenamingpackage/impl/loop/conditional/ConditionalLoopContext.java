package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContext;

/**
 * Conditional LoopContext
 */
public final class ConditionalLoopContext implements LoopContext {
	private final ConditionalLoopState myLoopState;

	/**
	 * @param nLoopControlParameterFinalValue int
	 */
	public LoopContext(final Predicate<ConditionalLoopState> loopFinishedCondition) {
		super();
		this.myLoopState = new ConditionalLoopState(loopFinishedCondition);
	}

	/**
	 * @return void
	 */
	@Override
	public void start() {
	}

	/**
	 * @return boolean
	 */
	@Override
	public boolean shouldProceed() {
		return this.myLoopState.getLoopCondition().evaluateLoop(this.myLoopState, this.myLoopState.getLoopIsFinishedChecker());
	}

	/**
	 * @return void
	 */
	@Override
	public void proceed() {
	}

	/**
	 * @return int
	 */
	@Override
	public int getControlParameter() {
		throw new UnsupportedOperationException(Constants.A_CONDITIONAL_LOOP_HAS_NO_CONTROL_PARAMETER);
	}

	@Override
	public ConditionalLoopState getLoopState() {
		return this.myLoopState;
	}
}
