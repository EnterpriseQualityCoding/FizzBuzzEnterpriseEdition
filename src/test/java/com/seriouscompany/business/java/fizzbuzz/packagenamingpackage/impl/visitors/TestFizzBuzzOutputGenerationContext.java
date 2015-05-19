
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.BuzzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.IntegerIntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.NoFizzNoBuzzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.DataPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestFizzBuzzOutputGenerationContext {


    @Test
    public void testConstructor() {
         
        // Generate the arguments
         
        NoFizzNoBuzzStrategy mockstrategy = Mockito.mock(NoFizzNoBuzzStrategy.class);
        IntegerIntegerPrinter mockprinter = Mockito.mock(IntegerIntegerPrinter.class);
         
        // Invoke the method
         
        FizzBuzzOutputGenerationContext fizzBuzzOutputGenerationContext = new FizzBuzzOutputGenerationContext(mockstrategy, mockprinter);
         
        // Assert the fields are what we expect
         
        DataPrinter printer = fizzBuzzOutputGenerationContext.getPrinter();
        Assert.assertEquals(mockprinter, printer);
        IsEvenlyDivisibleStrategy strategy = fizzBuzzOutputGenerationContext.getStrategy();
        Assert.assertEquals(mockstrategy, strategy);
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testGetStrategy() {
         
        // Generate the fields
         
        NoFizzNoBuzzStrategy mockstrategy = Mockito.mock(NoFizzNoBuzzStrategy.class);
         
        // Error: No constructor available. Skipping..
         
    }

    @Test
    public void testGetPrinter() {
         
        // Generate the fields
         
        BuzzStringPrinter mockprinter = Mockito.mock(BuzzStringPrinter.class);
         
        // Error: No constructor available. Skipping..
         
    }

}
