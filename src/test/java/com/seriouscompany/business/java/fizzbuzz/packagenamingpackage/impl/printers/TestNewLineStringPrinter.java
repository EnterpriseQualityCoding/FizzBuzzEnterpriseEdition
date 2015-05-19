
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import java.lang.reflect.Field;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NewLineStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.SystemOutFizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestNewLineStringPrinter {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        NewLineStringPrinter newLineStringPrinter = new NewLineStringPrinter();
    }

    @Test
    public void testPrint()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        NewLineStringReturnerFactory mockNewLineStringReturnerFactory = Mockito.mock(NewLineStringReturnerFactory.class);
        NewLineStringReturner mockNewLineStringReturner = Mockito.mock(NewLineStringReturner.class);
        Mockito.when(mockNewLineStringReturner.getReturnString()).thenReturn("");
        Mockito.when(mockNewLineStringReturnerFactory.createStringStringReturner()).thenReturn(mockNewLineStringReturner);
        SystemOutFizzBuzzOutputStrategyFactory mockSystemOutFizzBuzzOutputStrategyFactory = Mockito.mock(SystemOutFizzBuzzOutputStrategyFactory.class);
        SystemOutFizzBuzzOutputStrategy mockfizzBuzzOutputStrategy = Mockito.mock(SystemOutFizzBuzzOutputStrategy.class);
        Mockito.when(mockSystemOutFizzBuzzOutputStrategyFactory.createOutputStrategy()).thenReturn(mockfizzBuzzOutputStrategy);
        NewLineStringPrinter newLineStringPrinter = new NewLineStringPrinter();
        Field field = newLineStringPrinter.getClass().getDeclaredField("_newLineStringReturnerFactory");
        field.setAccessible(true);
        field.set(newLineStringPrinter, mockNewLineStringReturnerFactory);
        Field field1 = newLineStringPrinter.getClass().getDeclaredField("_systemOutFizzBuzzOutputStrategyFactory");
        field1 .setAccessible(true);
        field1 .set(newLineStringPrinter, mockSystemOutFizzBuzzOutputStrategyFactory);
         
        // Invoke the method
         
        newLineStringPrinter.print();
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockNewLineStringReturner, Mockito.times(1)).getReturnString();
        Mockito.verify(mockNewLineStringReturnerFactory, Mockito.times(1)).createStringStringReturner();
        Mockito.verify(mockSystemOutFizzBuzzOutputStrategyFactory, Mockito.times(1)).createOutputStrategy();
    }

}
