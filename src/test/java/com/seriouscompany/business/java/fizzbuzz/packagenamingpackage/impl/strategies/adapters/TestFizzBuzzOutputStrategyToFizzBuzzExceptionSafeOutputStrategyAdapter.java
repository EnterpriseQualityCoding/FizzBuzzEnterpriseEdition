
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import java.lang.reflect.Field;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.SystemOutFizzBuzzOutputStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestFizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter {


    @Test
    public void testConstructor()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the arguments
         
        SystemOutFizzBuzzOutputStrategy mockfizzBuzzOutputStrategy = Mockito.mock(SystemOutFizzBuzzOutputStrategy.class);
         
        // Invoke the method
         
        FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter fizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter = new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(mockfizzBuzzOutputStrategy);
         
        // Assert the fields are what we expect
         
        Field field = fizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter.getClass().getDeclaredField("_fizzBuzzOutputStrategy");
        field.setAccessible(true);
        SystemOutFizzBuzzOutputStrategy _fizzBuzzOutputStrategy = ((SystemOutFizzBuzzOutputStrategy) field.get(fizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter));
        Assert.assertEquals(mockfizzBuzzOutputStrategy, _fizzBuzzOutputStrategy);
         
        // Assert that our method interactions are what we expect.
         
    }

    @Test
    public void testOutput() {
         
        // Generate the arguments
         
         
        // Generate the fields
         
        SystemOutFizzBuzzOutputStrategy mockfizzBuzzOutputStrategy = Mockito.mock(SystemOutFizzBuzzOutputStrategy.class);
         
        // Error: No constructor available. Skipping..
         
    }

}
