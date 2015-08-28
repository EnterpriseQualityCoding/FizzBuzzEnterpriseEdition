
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestFizzStrategy {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        FizzStrategy fizzStrategy = new FizzStrategy();
    }

    @Test
    public void testIsEvenlyDivisible() {
         
        // Generate the arguments
         
        FizzStrategy fizzStrategy = new FizzStrategy();
         
        // Invoke the method
         
        boolean b = fizzStrategy.isEvenlyDivisible(100);
         
        // Assert the return value
         
        Assert.assertEquals(false, b);
    }

}
