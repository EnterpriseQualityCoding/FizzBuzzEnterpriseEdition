package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopState;

/**
 * Count-based LoopState
 */
public class CountBasedLoopState implements LoopState {
	private final CountBasedLoopInitializer myLoopInitializer;
	private final CountBasedLoopFinalizer myLoopFinalizer;
	private final CountBasedLoopCondition myLoopCondition;
	private final CountBasedLoopStep myLoopStep;
	private int myCurrentControlParameterValue;

	public LoopState(final int nLoopControlParameterFinalValue) {
		final ApplicationContext context = new ClassPathXmlApplicationContext(Constants.SPRING_XML);
		final LoopComponentFactory myLoopComponentFactory = context.getBean(Constants.LOOP_COMPONENT_FACTORY,
				LoopComponentFactory.class);
		this.myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		this.myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nLoopControlParameterFinalValue);
		this.myLoopCondition = myLoopComponentFactory.createLoopCondition();
		this.myLoopStep = myLoopComponentFactory.createLoopStep();
		((ConfigurableApplicationContext) context).close();
	}

	public ConditionalLoopInitializer getLoopInitializer() {
		return this.myLoopInitializer;
	}
	public ConditionalLoopFinalizer getLoopFinalizer() {
		return this.myLoopFinalizer;
	}
	public ConditionalLoopCondition getLoopCondition() {
		return this.myLoopCondition;
	}
	public ConditionalLoopStep getLoopStep() {
		return this.myLoopStep;
	}
	public int getCurrentControlParameterValue() {
		return this.myCurrentControlParameterValue;
	}
	public int setCurrentControlParameterValue(int currentControlParameterValue) {
		return this.myCurrentControlParameterValue = currentControlParameterValue;
	}
}