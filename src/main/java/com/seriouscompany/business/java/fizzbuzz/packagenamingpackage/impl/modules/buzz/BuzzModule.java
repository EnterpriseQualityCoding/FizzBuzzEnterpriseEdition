package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.constants.BuzzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.factories.BuzzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.buzz.factories.BuzzStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules.Module;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;

public class BuzzModule implements Module {

    @Override
    public IsEvenlyDivisibleStrategyFactory getStrategyFactory() {
        final BuzzStrategyFactory myBuzzStrategyFactory = new BuzzStrategyFactory();
        return myBuzzStrategyFactory;
    }

    @Override
    public StringPrinterFactory getPrinterFactory() {
        final BuzzStringPrinterFactory myBuzzStringPrinterFactory = new BuzzStringPrinterFactory();
        return myBuzzStringPrinterFactory;
    }
    
    @Override
    public int getPriority() {
        return BuzzStrategyConstants.BUZZ_MODULE_PRIORITY;
    }

}
