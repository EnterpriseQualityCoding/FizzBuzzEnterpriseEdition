
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.SystemOutFizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzStringReturner;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;


/**
 * Generated Unit Tests
 */
public class TestFizzStringPrinter {


    @Test
    public void testConstructor() {

        // Invoke the method

        FizzStringPrinter fizzStringPrinter = new FizzStringPrinter();
    }

    @Test
    public void testPrint()
            throws IllegalAccessException, NoSuchFieldException {

        // Generate the fields

        FizzStringReturnerFactory mockFizzStringReturnerFactory = Mockito.mock(FizzStringReturnerFactory.class);
        FizzStringReturner mockFizzStringReturner = Mockito.mock(FizzStringReturner.class);
        Mockito.when(mockFizzStringReturner.getReturnString()).thenReturn("");
        Mockito.when(mockFizzStringReturnerFactory.createStringStringReturner()).thenReturn(mockFizzStringReturner);
        SystemOutFizzBuzzOutputStrategyFactory mockSystemOutFizzBuzzOutputStrategyFactory = Mockito.mock(SystemOutFizzBuzzOutputStrategyFactory.class);
        SystemOutFizzBuzzOutputStrategy mockfizzBuzzOutputStrategy = Mockito.mock(SystemOutFizzBuzzOutputStrategy.class);
        Mockito.when(mockSystemOutFizzBuzzOutputStrategyFactory.createOutputStrategy()).thenReturn(mockfizzBuzzOutputStrategy);
        FizzStringPrinter fizzStringPrinter = new FizzStringPrinter();
        Field field = fizzStringPrinter.getClass().getDeclaredField("_fizzStringReturnerFactory");
        field.setAccessible(true);
        field.set(fizzStringPrinter, mockFizzStringReturnerFactory);
        Field field1 = fizzStringPrinter.getClass().getDeclaredField("_systemOutFizzBuzzOutputStrategyFactory");
        field1.setAccessible(true);
        field1.set(fizzStringPrinter, mockSystemOutFizzBuzzOutputStrategyFactory);

        // Invoke the method

        fizzStringPrinter.print();

        // Assert that our method interactions are what we expect.

        Mockito.verify(mockFizzStringReturner, Mockito.times(1)).getReturnString();
        Mockito.verify(mockFizzStringReturnerFactory, Mockito.times(1)).createStringStringReturner();
        Mockito.verify(mockSystemOutFizzBuzzOutputStrategyFactory, Mockito.times(1)).createOutputStrategy();
    }

}
