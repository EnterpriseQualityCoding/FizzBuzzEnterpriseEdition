package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.nofizznobuzz;

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
		final NoFizzNoBuzzReturnerFactory returnerFactory = new NoFizzNoBuzzReturnerFactory();
        final NoFizzNoBuzzPrinterFactory myNoFizzNoBuzzPrinterFactory = new NoFizzNoBuzzPrinterFactory(returnerFactory);
        return myNoFizzNoBuzzPrinterFactory;
    }

    @Override
    public int getPriority() {
        return NoFizzNoBuzzStrategyConstants.NOFIZZNOBUZZ_MODULE_PRIORITY;
    }

}
