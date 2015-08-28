
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters;

import java.lang.reflect.Field;
import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestDefaultFizzBuzzUpperLimitParameter {


    @Test
    public void testConstructor()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Invoke the method
         
        DefaultFizzBuzzUpperLimitParameter defaultFizzBuzzUpperLimitParameter = new DefaultFizzBuzzUpperLimitParameter();
         
        // Assert the fields are what we expect
         
        Field field = defaultFizzBuzzUpperLimitParameter.getClass().getDeclaredField("DefaultFizzBuzzUpperLimitParameterValue");
        field.setAccessible(true);
        int defaultFizzBuzzUpperLimitParameterValue = ((int) field.get(defaultFizzBuzzUpperLimitParameter));
        Assert.assertEquals(100, defaultFizzBuzzUpperLimitParameterValue);
    }

    @Test
    public void testObtainUpperLimitValue() {
        DefaultFizzBuzzUpperLimitParameter defaultFizzBuzzUpperLimitParameter = new DefaultFizzBuzzUpperLimitParameter();
         
        // Invoke the method
         
        int i = defaultFizzBuzzUpperLimitParameter.obtainUpperLimitValue();
         
        // Assert the return value
         
        Assert.assertEquals(100, i);
    }

}
