
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.converters.primitivetypesconverters;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestDoubleToIntConverter {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        DoubleToIntConverter doubleToIntConverter = new DoubleToIntConverter();
    }

    @Test
    public void testConvert() {
         
        // Generate the arguments
         
         
        // Invoke the method
         
        int i = DoubleToIntConverter.Convert(20.0D);
         
        // Assert the return value
         
        Assert.assertEquals(20, i);
    }

}
