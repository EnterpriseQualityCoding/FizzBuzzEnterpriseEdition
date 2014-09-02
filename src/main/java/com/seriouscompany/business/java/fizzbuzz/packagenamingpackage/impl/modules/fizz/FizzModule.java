package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.factories.FizzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.fizz.factories.FizzStringPrinterFactory;
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
        final FizzStringPrinterFactory myFizzStringPrinterFactory = new FizzStringPrinterFactory();
        return myFizzStringPrinterFactory;
    }

}
