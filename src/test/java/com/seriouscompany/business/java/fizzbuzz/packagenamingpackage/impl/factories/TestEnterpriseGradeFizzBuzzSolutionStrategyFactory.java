
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import java.lang.reflect.Field;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.EnterpriseGradeFizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestEnterpriseGradeFizzBuzzSolutionStrategyFactory {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        EnterpriseGradeFizzBuzzSolutionStrategyFactory enterpriseGradeFizzBuzzSolutionStrategyFactory = new EnterpriseGradeFizzBuzzSolutionStrategyFactory();
    }

    @Test
    public void testCreateFizzBuzzSolutionStrategy()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        EnterpriseGradeFizzBuzzSolutionStrategy mockEnterpriseGradeFizzBuzzSolutionStrategy = Mockito.mock(EnterpriseGradeFizzBuzzSolutionStrategy.class);
        EnterpriseGradeFizzBuzzSolutionStrategyFactory enterpriseGradeFizzBuzzSolutionStrategyFactory = new EnterpriseGradeFizzBuzzSolutionStrategyFactory();
        Field field = enterpriseGradeFizzBuzzSolutionStrategyFactory.getClass().getDeclaredField("_fizzBuzzSolutionStrategy");
        field.setAccessible(true);
        field.set(enterpriseGradeFizzBuzzSolutionStrategyFactory, mockEnterpriseGradeFizzBuzzSolutionStrategy);
         
        // Invoke the method
         
        FizzBuzzSolutionStrategy fizzBuzzSolutionStrategy = enterpriseGradeFizzBuzzSolutionStrategyFactory.createFizzBuzzSolutionStrategy();
         
        // Assert that our method interactions are what we expect.
         
    }

}
