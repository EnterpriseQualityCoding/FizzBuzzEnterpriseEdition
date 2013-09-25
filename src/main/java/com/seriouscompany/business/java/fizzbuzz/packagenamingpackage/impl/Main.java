package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import java.util.Locale;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.i18n.LocaleManager;

public class Main {
	public static void main(String[] args) {
        // read configuration. If no configuration is provided, fall back to default
        // What's our locale -- for printing strings, number separator, etc.
        Locale ourLocale = Locale.ENGLISH;
        if (args.length > 1 && args[0].equals("-l")) {
            String localeString = args[1];
            String [] parts = localeString.split("_");
            switch (parts.length) {
                case 1: ourLocale = new Locale(parts[0]); break;
                case 2: ourLocale = new Locale(parts[0], parts[1]); break;
                default: ourLocale = new Locale(parts[0], parts[1], parts[2]); break;
            }
        }
        LocaleManager.getInstance().setLocale(ourLocale);
		FizzBuzz myFizzBuzz = new FizzBuzz();
		myFizzBuzz.fizzbuzz(100);
	}
}
