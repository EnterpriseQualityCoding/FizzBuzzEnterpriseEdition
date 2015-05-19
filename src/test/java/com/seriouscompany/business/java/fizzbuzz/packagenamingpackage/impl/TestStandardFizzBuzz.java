
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import java.lang.reflect.Field;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.EnterpriseGradeFizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.EnterpriseGradeFizzBuzzSolutionStrategy;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestStandardFizzBuzz {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        StandardFizzBuzz standardFizzBuzz = new StandardFizzBuzz();
    }

    @Test
    public void testFizzBuzz()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the arguments
         
         
        // Generate the fields
         
        EnterpriseGradeFizzBuzzSolutionStrategyFactory mockEnterpriseGradeFizzBuzzSolutionStrategyFactory = Mockito.mock(EnterpriseGradeFizzBuzzSolutionStrategyFactory.class);
        EnterpriseGradeFizzBuzzSolutionStrategy mockEnterpriseGradeFizzBuzzSolutionStrategy = Mockito.mock(EnterpriseGradeFizzBuzzSolutionStrategy.class);
        Mockito.when(mockEnterpriseGradeFizzBuzzSolutionStrategyFactory.createFizzBuzzSolutionStrategy()).thenReturn(mockEnterpriseGradeFizzBuzzSolutionStrategy);
        StandardFizzBuzz standardFizzBuzz = new StandardFizzBuzz();
        Field field = standardFizzBuzz.getClass().getDeclaredField("_fizzBuzzSolutionStrategyFactory");
        field.set(standardFizzBuzz, mockEnterpriseGradeFizzBuzzSolutionStrategyFactory);
         
        // Invoke the method
         
        standardFizzBuzz.fizzBuzz(100);
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockEnterpriseGradeFizzBuzzSolutionStrategy, Mockito.times(1)).runSolution(Mockito.eq(100));
        Mockito.verify(mockEnterpriseGradeFizzBuzzSolutionStrategyFactory, Mockito.times(1)).createFizzBuzzSolutionStrategy();
    }

}
