
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestNoFizzNoBuzzStrategy {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        NoFizzNoBuzzStrategy noFizzNoBuzzStrategy = new NoFizzNoBuzzStrategy();
    }

    @Test
    public void testIsEvenlyDivisible() {
         
        // Generate the arguments
         
        NoFizzNoBuzzStrategy noFizzNoBuzzStrategy = new NoFizzNoBuzzStrategy();
         
        // Invoke the method
         
        boolean b = noFizzNoBuzzStrategy.isEvenlyDivisible(100);
         
        // Assert the return value
         
        Assert.assertEquals(false, b);
    }

}
