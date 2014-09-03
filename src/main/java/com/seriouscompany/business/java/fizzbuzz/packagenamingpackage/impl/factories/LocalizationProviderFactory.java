package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules.Module;

public class LocalizationProviderFactory {

	public static ResourceBundle createLocalizationProvider(Module module) {
    	String path = module.getClass().getPackage().getName();
    	path = path.replace(".", "/");
    	path += "/resources/strings";
		return ResourceBundle.getBundle(path);
	}
}
