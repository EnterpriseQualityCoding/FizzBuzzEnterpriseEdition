
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.converters.primitivetypesconverters;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestIntToDoubleConverter {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        IntToDoubleConverter intToDoubleConverter = new IntToDoubleConverter();
    }

    @Test
    public void testConvert() {
         
        // Generate the arguments
         
         
        // Invoke the method
         
        double d = IntToDoubleConverter.Convert(5);
         
        // Assert the return value
         
        Assert.assertEquals(5.0D, d, 0.0F);
    }

}
