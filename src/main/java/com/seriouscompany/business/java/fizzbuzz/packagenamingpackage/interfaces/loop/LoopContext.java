package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * LoopContext
 */
public interface LoopContext extends LoopContextStateManipulation, LoopContextStateRetrieval {

	/**
	 * @return void
	 */
	@Override
	public void start();

	/**
	 * @return boolean
	 */
	@Override
	public boolean shouldProceed();

	/**
	 * @return void
	 */
	@Override
	public void proceed();

	/**
	 * @return int
	 */
	@Override
	public int getControlParameter();

}