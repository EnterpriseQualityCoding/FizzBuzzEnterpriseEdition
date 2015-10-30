package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.*;
import org.springframework.stereotype.Service;

@Service
public class ApplicationContextHolder implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	private ApplicationContextHolder() {
	}

	public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
		ApplicationContextHolder.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return ApplicationContextHolder.applicationContext;
	}
}
