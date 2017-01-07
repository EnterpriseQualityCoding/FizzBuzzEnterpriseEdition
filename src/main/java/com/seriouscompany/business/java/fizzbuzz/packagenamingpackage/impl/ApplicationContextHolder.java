package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class ApplicationContextHolder implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	private static class ApplicationContextReferenceUpdater {
		void updateApplicationContextReference(final ApplicationContext applicationContext) {
			ApplicationContextHolder.applicationContext = applicationContext;
		}
	}

	private static class ApplicationContextReferenceUpdaterHolder {
		static ApplicationContextReferenceUpdater INSTANCE = new ApplicationContextReferenceUpdater();
	}

	private ApplicationContextHolder() {
		super();
	}

	@Override
	public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
		ApplicationContextReferenceUpdaterHolder.INSTANCE.updateApplicationContextReference(applicationContext);
	}

	public static ApplicationContext getApplicationContext() {
		return ApplicationContextHolder.applicationContext;
	}

}
