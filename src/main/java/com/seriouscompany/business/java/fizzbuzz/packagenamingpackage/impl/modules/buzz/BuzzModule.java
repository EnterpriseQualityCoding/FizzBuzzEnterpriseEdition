package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.constants.BuzzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.factories.BuzzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.factories.BuzzStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.factories.BuzzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules.Module;

public class BuzzModule implements Module {

    @Override
    public IsEvenlyDivisibleStrategyFactory getStrategyFactory() {
        final BuzzStrategyFactory myBuzzStrategyFactory = new BuzzStrategyFactory();
        return myBuzzStrategyFactory;
    }

    @Override
    public StringPrinterFactory getPrinterFactory() {
		final BuzzStringReturnerFactory returnerFactory = new BuzzStringReturnerFactory();
        final BuzzStringPrinterFactory myBuzzStringPrinterFactory = new BuzzStringPrinterFactory(returnerFactory);
        return myBuzzStringPrinterFactory;
    }
    
    @Override
    public int getPriority() {
        return BuzzStrategyConstants.BUZZ_MODULE_PRIORITY;
    }

}
