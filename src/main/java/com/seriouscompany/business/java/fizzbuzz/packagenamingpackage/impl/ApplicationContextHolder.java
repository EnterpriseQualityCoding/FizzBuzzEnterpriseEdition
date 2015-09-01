package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.*;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;

@Service
public class ApplicationContextHolder implements ApplicationContextAware {

	@Nonnull
	private static ApplicationContext applicationContext;

	private ApplicationContextHolder() {
	}

	public void setApplicationContext(@Nonnull final ApplicationContext applicationContext) throws BeansException {
		ApplicationContextHolder.applicationContext = applicationContext;
	}

	@Nonnull
	public static ApplicationContext getApplicationContext() {
		return ApplicationContextHolder.applicationContext;
	}
}
