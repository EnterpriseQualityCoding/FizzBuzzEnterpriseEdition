package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * Holder for Application Context
 */
@Service
public class ApplicationContextHolder implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	/**
	 * Updater for ApplicationContextReference
	 */
	private static class ApplicationContextReferenceUpdater {
		void updateApplicationContextReference(final ApplicationContext applicationContext) {
			ApplicationContextHolder.applicationContext = applicationContext;
		}
	}

	/**
	 * Holder for ApplicationContextReferenceUpdater
	 */
	private static class ApplicationContextReferenceUpdaterHolder {
		static ApplicationContextReferenceUpdater INSTANCE = new ApplicationContextReferenceUpdater();
	}

	private ApplicationContextHolder() {
		super();
	}

	/**
	 * @param applicationContext
	 * @throws BeansException
	 */
	@Override
	public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
		ApplicationContextReferenceUpdaterHolder.INSTANCE.updateApplicationContextReference(applicationContext);
	}

	/**
	 * @return
	 */
	public static ApplicationContext getApplicationContext() {
		return ApplicationContextHolder.applicationContext;
	}

}
