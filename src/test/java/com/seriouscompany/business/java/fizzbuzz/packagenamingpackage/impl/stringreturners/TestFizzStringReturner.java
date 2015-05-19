
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestFizzStringReturner {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        FizzStringReturner fizzStringReturner = new FizzStringReturner();
    }

    @Test
    public void testGetReturnString() {
        FizzStringReturner fizzStringReturner = new FizzStringReturner();
         
        // Invoke the method
         
        String string = fizzStringReturner.getReturnString();
         
        // Assert the return value
         
        Assert.assertEquals("Fizz", string);
    }

}
