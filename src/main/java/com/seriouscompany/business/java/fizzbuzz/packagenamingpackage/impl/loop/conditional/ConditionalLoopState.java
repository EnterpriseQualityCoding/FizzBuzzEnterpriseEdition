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
 * Conditional LoopState
 */
public class ConditionalLoopState implements LoopState {
	private final ConditionalLoopInitializer myLoopInitializer;
	private final ConditionalLoopFinalizer myLoopFinalizer;
	private final ConditionalLoopCondition myLoopCondition;
	private final ConditionalLoopStep myLoopStep;
	private final ConditionalLoopIsFinishedChecker myLoopCompletionConditionChecker;

	public LoopState(final Predicate<ConditionalLoopState> loopFinishedCondition) {
		final ApplicationContext context = new ClassPathXmlApplicationContext(Constants.SPRING_XML);
		final LoopComponentFactory myLoopComponentFactory = context.getBean(Constants.LOOP_COMPONENT_FACTORY,
				LoopComponentFactory.class);
		this.myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		this.myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nLoopControlParameterFinalValue);
		this.myLoopCondition = myLoopComponentFactory.createLoopCondition();
		this.myLoopStep = myLoopComponentFactory.createLoopStep();
		this.myLoopCompletionConditionChecker = 
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
	public ConditionalLoopIsFinishedChecker getLoopCompletionConditionChecker() {
		return this.myLoopCompletionConditionChecker;
	}

}