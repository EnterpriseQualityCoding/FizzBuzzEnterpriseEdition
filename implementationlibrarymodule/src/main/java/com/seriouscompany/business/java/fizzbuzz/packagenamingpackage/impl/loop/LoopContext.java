package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;

public final class LoopContext implements LoopContextStateManipulation, LoopContextStateRetrieval {

	private final LoopInitializer myLoopInitializer;
	private final LoopFinalizer myLoopFinalizer;
	private final LoopCondition myLoopCondition;
	private final LoopStep myLoopStep;
	private int myCurrentControlParameterValue;

	public LoopContext(final int nLoopControlParameterFinalValue) {
		final ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		final LoopComponentFactory myLoopComponentFactory = context.getBean("loopComponentFactory",
				LoopComponentFactory.class);
		this.myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		this.myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nLoopControlParameterFinalValue);
		this.myLoopCondition = myLoopComponentFactory.createLoopCondition();
		this.myLoopStep = myLoopComponentFactory.createLoopStep();
		((ConfigurableApplicationContext) context).close();
	}

	@Override
	public void start() {
		this.myCurrentControlParameterValue =
				this.myLoopInitializer.getLoopInitializationPoint();
	}

	@Override
	public boolean shouldProceed() {
		return this.myLoopCondition.evaluateLoop(this.myCurrentControlParameterValue,
				this.myLoopFinalizer.getLoopFinalizationPoint());
	}

	@Override
	public void proceed() {
		this.myCurrentControlParameterValue =
				this.myLoopStep.stepLoop(this.myCurrentControlParameterValue);
	}

	@Override
	public int getControlParameter() {
		return this.myCurrentControlParameterValue;
	}

}
