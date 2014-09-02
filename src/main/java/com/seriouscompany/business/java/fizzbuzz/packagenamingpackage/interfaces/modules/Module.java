package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.DataPrinterFactory;

public interface Module {

    public IsEvenlyDivisibleStrategyFactory getStrategyFactory();
    public DataPrinterFactory getPrinterFactory();

}
