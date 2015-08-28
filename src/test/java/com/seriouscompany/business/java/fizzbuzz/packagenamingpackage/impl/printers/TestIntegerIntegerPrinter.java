
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.IntegerIntegerStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.SystemOutFizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;


/**
 * Generated Unit Tests
 * 
 */
public class TestIntegerIntegerPrinter {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        IntegerIntegerPrinter integerIntegerPrinter = new IntegerIntegerPrinter();
    }

    @Test
    public void testPrintInteger()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the arguments
         
         
        // Generate the fields
         
        IntegerIntegerStringReturnerFactory mockIntegerIntegerStringReturnerFactory = Mockito.mock(IntegerIntegerStringReturnerFactory.class);
        IntegerIntegerStringReturner mockIntegerIntegerStringReturner = Mockito.mock(IntegerIntegerStringReturner.class);
        Mockito.when(mockIntegerIntegerStringReturner.getIntegerReturnString(Mockito.eq(98))).thenReturn("");
        Mockito.when(mockIntegerIntegerStringReturnerFactory.createIntegerStringReturner()).thenReturn(mockIntegerIntegerStringReturner);
        SystemOutFizzBuzzOutputStrategyFactory mockSystemOutFizzBuzzOutputStrategyFactory = Mockito.mock(SystemOutFizzBuzzOutputStrategyFactory.class);
        SystemOutFizzBuzzOutputStrategy mockfizzBuzzOutputStrategy = Mockito.mock(SystemOutFizzBuzzOutputStrategy.class);
        Mockito.when(mockSystemOutFizzBuzzOutputStrategyFactory.createOutputStrategy()).thenReturn(mockfizzBuzzOutputStrategy);
        IntegerIntegerPrinter integerIntegerPrinter = new IntegerIntegerPrinter();
        Field field = integerIntegerPrinter.getClass().getDeclaredField("_integerIntegerStringReturnerFactory");
        field.setAccessible(true);
        field.set(integerIntegerPrinter, mockIntegerIntegerStringReturnerFactory);
        Field field1 = integerIntegerPrinter.getClass().getDeclaredField("_systemOutFizzBuzzOutputStrategyFactory");
        field1 .setAccessible(true);
        field1 .set(integerIntegerPrinter, mockSystemOutFizzBuzzOutputStrategyFactory);
         
        // Invoke the method
         
        integerIntegerPrinter.printInteger(98);
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockIntegerIntegerStringReturner, Mockito.times(1)).getIntegerReturnString(Mockito.eq(98));
        Mockito.verify(mockIntegerIntegerStringReturnerFactory, Mockito.times(1)).createIntegerStringReturner();
        Mockito.verify(mockSystemOutFizzBuzzOutputStrategyFactory, Mockito.times(1)).createOutputStrategy();
    }

}
