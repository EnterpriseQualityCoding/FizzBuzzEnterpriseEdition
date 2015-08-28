
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestIntegerIntegerStringReturner {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        IntegerIntegerStringReturner integerIntegerStringReturner = new IntegerIntegerStringReturner();
    }

    @Test
    public void testGetIntegerReturnString() {
         
        // Generate the arguments
         
        IntegerIntegerStringReturner integerIntegerStringReturner = new IntegerIntegerStringReturner();
         
        // Invoke the method
         
        String string = integerIntegerStringReturner.getIntegerReturnString(98);
         
        // Assert the return value
         
        Assert.assertEquals("98", string);
    }

}
