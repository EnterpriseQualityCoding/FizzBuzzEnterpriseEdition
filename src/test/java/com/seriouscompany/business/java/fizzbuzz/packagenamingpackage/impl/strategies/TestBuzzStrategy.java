
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestBuzzStrategy {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        BuzzStrategy buzzStrategy = new BuzzStrategy();
    }

    @Test
    public void testIsEvenlyDivisible() {
         
        // Generate the arguments
         
        BuzzStrategy buzzStrategy = new BuzzStrategy();
         
        // Invoke the method
         
        boolean b = buzzStrategy.isEvenlyDivisible(100);
         
        // Assert the return value
         
        Assert.assertEquals(true, b);
    }

}
