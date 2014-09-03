package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LocalizationProviderFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.constants.NoFizzNoBuzzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.factories.NoFizzNoBuzzReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.factories.NoFizzNoBuzzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz.factories.NoFizzNoBuzzPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules.Module;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerPrinterFactory;

public class NoFizzNoBuzzModule implements Module {

    @Override
    public IsEvenlyDivisibleStrategyFactory getStrategyFactory() {
        final NoFizzNoBuzzStrategyFactory myNoFizzNoBuzzStrategyFactory = new NoFizzNoBuzzStrategyFactory();
        return myNoFizzNoBuzzStrategyFactory;
    }

    @Override
    public IntegerPrinterFactory getPrinterFactory() {
		final ResourceBundle l10n = LocalizationProviderFactory.createLocalizationProvider(this);
		final NoFizzNoBuzzReturnerFactory returnerFactory = new NoFizzNoBuzzReturnerFactory(l10n);
        final NoFizzNoBuzzPrinterFactory myNoFizzNoBuzzPrinterFactory = new NoFizzNoBuzzPrinterFactory(returnerFactory);
        return myNoFizzNoBuzzPrinterFactory;
    }

    @Override
    public int getPriority() {
        return NoFizzNoBuzzStrategyConstants.NOFIZZNOBUZZ_MODULE_PRIORITY;
    }

}
