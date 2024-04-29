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
 * Count-based LoopContext
 */
public final class CountBasedLoopContext implements LoopContext {
	private final CountBasedLoopState myLoopState;

	/**
	 * @param nLoopControlParameterFinalValue int
	 */
	public CountBasedLoopContext(final int nLoopControlParameterFinalValue) {
		super();
		this.myLoopState = new CountBasedLoopState(nLoopControlParameterFinalValue);
	}

	/**
	 * @return void
	 */
	@Override
	public void start() {
		this.myLoopState.setCurrentControlParameterValue(
				this.myLoopState.getLoopInitializer().getLoopInitializationPoint());
	}

	/**
	 * @return boolean
	 */
	@Override
	public boolean shouldProceed() {
		return this.myLoopState.getLoopCondition().evaluateLoop(this.myLoopState.getCurrentControlParameterValue(),
				this.myLoopState.getLoopFinalizer().getLoopFinalizationPoint());
	}

	/**
	 * @return void
	 */
	@Override
	public void proceed() {
		this.myLoopState.setCurrentControlParameterValue(
				this.myLoopState.getLoopStep().stepLoop(this.myCurrentControlParameterValue));
	}

	/**
	 * @return int
	 */
	@Override
	public int getControlParameter() {
		return this.myLoopState.getCurrentControlParameterValue();
	}

	@Override
	public CountBasedLoopState getLoopState() {
		return this.myLoopState;
	}
}
