package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LocalizationProviderFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.constants.FizzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.factories.FizzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.factories.FizzStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.factories.FizzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules.Module;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;

public class FizzModule implements Module {

    @Override
    public IsEvenlyDivisibleStrategyFactory getStrategyFactory() {
        final FizzStrategyFactory myFizzStrategyFactory = new FizzStrategyFactory();
        return myFizzStrategyFactory;
    }

    @Override
    public StringPrinterFactory getPrinterFactory() {
		final ResourceBundle l10n = LocalizationProviderFactory.createLocalizationProvider(this);
		final FizzStringReturnerFactory myFizzStringReturnerFactory = new FizzStringReturnerFactory(l10n);
        final FizzStringPrinterFactory myFizzStringPrinterFactory
        		= new FizzStringPrinterFactory(myFizzStringReturnerFactory);
        return myFizzStringPrinterFactory;
    }

    @Override
    public int getPriority() {
        return FizzStrategyConstants.FIZZ_MODULE_PRIORITY;
    }

}
