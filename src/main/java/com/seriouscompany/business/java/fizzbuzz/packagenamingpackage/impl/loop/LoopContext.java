package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateManipulation;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;

public class LoopContext implements LoopContextStateManipulation, LoopContextStateRetrieval {

	LoopInitializer myLoopInitializer;
	LoopFinalizer myLoopFinalizer;
	LoopCondition myLoopCondition;
	LoopStep myLoopStep;
	int myCurrentControlParameterValue;

	public LoopContext(int nLoopControlParameterFinalValue) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		final LoopComponentFactory myLoopComponentFactory = (LoopComponentFactory) context.getBean("loopComponentFactory");
		myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		myLoopFinalizer = myLoopComponentFactory.createLoopFinalizer(nLoopControlParameterFinalValue);
		myLoopCondition = myLoopComponentFactory.createLoopCondition();
		myLoopStep = myLoopComponentFactory.createLoopStep();
		((ConfigurableApplicationContext) context).close();
	}

	@Override
	public void start() {
		myCurrentControlParameterValue =
			myLoopInitializer.getLoopInitializationPoint();
	}

	@Override
	public boolean shouldProceed() {
		return myLoopCondition.evaluateLoop(myCurrentControlParameterValue,
			myLoopFinalizer.getLoopFinalizationPoint());
	}

	@Override
	public void proceed() {
		myCurrentControlParameterValue =
			myLoopStep.stepLoop(myCurrentControlParameterValue);
	}

	@Override
	public int getControlParameter() {
		return myCurrentControlParameterValue;
	}

}
