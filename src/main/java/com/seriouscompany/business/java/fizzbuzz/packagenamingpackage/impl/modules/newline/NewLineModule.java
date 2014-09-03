package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LocalizationProviderFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.constants.NewLineStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories.NewLineStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories.NewLineStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories.NewLineStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules.Module;

public class NewLineModule implements Module {

    @Override
    public IsEvenlyDivisibleStrategyFactory getStrategyFactory() {
        final NewLineStrategyFactory myBuzzStrategyFactory = new NewLineStrategyFactory();
        return myBuzzStrategyFactory;
    }

    @Override
    public StringPrinterFactory getPrinterFactory() {
		final ResourceBundle l10n = LocalizationProviderFactory.createLocalizationProvider(this);
		final NewLineStringReturnerFactory returnerFactory = new NewLineStringReturnerFactory(l10n);
        final NewLineStringPrinterFactory myNewLineStringPrinterFactory = new NewLineStringPrinterFactory(returnerFactory);
        return myNewLineStringPrinterFactory;
    }
    
    @Override
    public int getPriority() {
        return NewLineStrategyConstants.NEWLINE_MODULE_PRIORITY;
    }

}
