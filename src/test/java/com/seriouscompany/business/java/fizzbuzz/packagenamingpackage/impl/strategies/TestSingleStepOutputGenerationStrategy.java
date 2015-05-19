
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import java.util.ArrayList;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzBuzzOutputGenerationContextVisitorFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.IntegerIntegerPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NewLineStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NoFizzNoBuzzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.BuzzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.FizzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.IntegerIntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.NewLineStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors.FizzBuzzOutputGenerationContextVisitor;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestSingleStepOutputGenerationStrategy {


    @Test
    public void testConstructor() {
         
        // Generate the arguments
         
        FizzBuzzOutputGenerationContextVisitorFactory mockfizzBuzzOutputGenerationContextVisitorFactory = Mockito.mock(FizzBuzzOutputGenerationContextVisitorFactory.class);
        FizzBuzzOutputGenerationContextVisitor mockFizzBuzzOutputGenerationContextVisitor = Mockito.mock(FizzBuzzOutputGenerationContextVisitor.class);
        Mockito.when(mockfizzBuzzOutputGenerationContextVisitorFactory.createVisitor()).thenReturn(mockFizzBuzzOutputGenerationContextVisitor);
        FizzStrategyFactory mockfizzStrategyFactory = Mockito.mock(FizzStrategyFactory.class);
        FizzStrategy mockstrategy = Mockito.mock(FizzStrategy.class);
        Mockito.when(mockfizzStrategyFactory.createIsEvenlyDivisibleStrategy()).thenReturn(mockstrategy);
        FizzStringPrinterFactory mockfizzStringPrinterFactory = Mockito.mock(FizzStringPrinterFactory.class);
        FizzStringPrinter mockprinter = Mockito.mock(FizzStringPrinter.class);
        Mockito.when(mockfizzStringPrinterFactory.createStringPrinter()).thenReturn(mockprinter);
        BuzzStrategyFactory mockbuzzStrategyFactory = Mockito.mock(BuzzStrategyFactory.class);
        BuzzStrategy mockstrategy1 = Mockito.mock(BuzzStrategy.class);
        Mockito.when(mockbuzzStrategyFactory.createIsEvenlyDivisibleStrategy()).thenReturn(mockstrategy1);
        BuzzStringPrinterFactory mockbuzzStringPrinterFactory = Mockito.mock(BuzzStringPrinterFactory.class);
        BuzzStringPrinter mockprinter1 = Mockito.mock(BuzzStringPrinter.class);
        Mockito.when(mockbuzzStringPrinterFactory.createStringPrinter()).thenReturn(mockprinter1);
        NoFizzNoBuzzStrategyFactory mocknoFizzNoBuzzStrategyFactory = Mockito.mock(NoFizzNoBuzzStrategyFactory.class);
        NoFizzNoBuzzStrategy mockstrategy2 = Mockito.mock(NoFizzNoBuzzStrategy.class);
        Mockito.when(mocknoFizzNoBuzzStrategyFactory.createIsEvenlyDivisibleStrategy()).thenReturn(mockstrategy2);
        IntegerIntegerPrinterFactory mockintegerIntegerPrinterFactory = Mockito.mock(IntegerIntegerPrinterFactory.class);
        IntegerIntegerPrinter mockprinter2 = Mockito.mock(IntegerIntegerPrinter.class);
        Mockito.when(mockintegerIntegerPrinterFactory.createPrinter()).thenReturn(mockprinter2);
        NewLineStringPrinterFactory mocknewLineStringPrinterFactory = Mockito.mock(NewLineStringPrinterFactory.class);
        NewLineStringPrinter mockNewLineStringPrinter = Mockito.mock(NewLineStringPrinter.class);
        Mockito.when(mocknewLineStringPrinterFactory.createStringPrinter()).thenReturn(mockNewLineStringPrinter);
         
        // Generate the fields
         
        ArrayList mockArrayList = Mockito.mock(ArrayList.class);
         
        // Invoke the method
         
        SingleStepOutputGenerationStrategy singleStepOutputGenerationStrategy = new SingleStepOutputGenerationStrategy(mockfizzBuzzOutputGenerationContextVisitorFactory, mockfizzStrategyFactory, mockfizzStringPrinterFactory, mockbuzzStrategyFactory, mockbuzzStringPrinterFactory, mocknoFizzNoBuzzStrategyFactory, mockintegerIntegerPrinterFactory, mocknewLineStringPrinterFactory);
         
        // Assert the fields are what we expect
         
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockfizzBuzzOutputGenerationContextVisitorFactory, Mockito.times(1)).createVisitor();
        Mockito.verify(mockfizzStrategyFactory, Mockito.times(1)).createIsEvenlyDivisibleStrategy();
        Mockito.verify(mockfizzStringPrinterFactory, Mockito.times(1)).createStringPrinter();
        Mockito.verify(mockbuzzStrategyFactory, Mockito.times(1)).createIsEvenlyDivisibleStrategy();
        Mockito.verify(mockbuzzStringPrinterFactory, Mockito.times(1)).createStringPrinter();
        Mockito.verify(mocknoFizzNoBuzzStrategyFactory, Mockito.times(1)).createIsEvenlyDivisibleStrategy();
        Mockito.verify(mockintegerIntegerPrinterFactory, Mockito.times(1)).createPrinter();
        Mockito.verify(mocknewLineStringPrinterFactory, Mockito.times(1)).createStringPrinter();
    }

}
