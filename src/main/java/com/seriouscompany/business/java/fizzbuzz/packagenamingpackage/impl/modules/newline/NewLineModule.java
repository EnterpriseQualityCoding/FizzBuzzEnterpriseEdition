package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.constants.NewLineStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories.NewLineStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories.NewLineStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules.Module;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;

public class NewLineModule implements Module {

    @Override
    public IsEvenlyDivisibleStrategyFactory getStrategyFactory() {
        final NewLineStrategyFactory myBuzzStrategyFactory = new NewLineStrategyFactory();
        return myBuzzStrategyFactory;
    }

    @Override
    public StringPrinterFactory getPrinterFactory() {
        final NewLineStringPrinterFactory myNewLineStringPrinterFactory = new NewLineStringPrinterFactory();
        return myNewLineStringPrinterFactory;
    }
    
    @Override
    public int getPriority() {
        return NewLineStrategyConstants.NEWLINE_MODULE_PRIORITY;
    }

}
