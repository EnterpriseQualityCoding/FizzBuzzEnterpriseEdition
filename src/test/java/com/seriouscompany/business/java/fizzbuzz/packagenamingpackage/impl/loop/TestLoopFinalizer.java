
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import java.lang.reflect.Field;
import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestLoopFinalizer {


    @Test
    public void testConstructor()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the arguments
         
         
        // Invoke the method
         
        LoopFinalizer loopFinalizer = new LoopFinalizer(100);
         
        // Assert the fields are what we expect
         
        Field field = loopFinalizer.getClass().getDeclaredField("nStoredLoopFinalValue");
        field.setAccessible(true);
        int nStoredLoopFinalValue = ((int) field.get(loopFinalizer));
        Assert.assertEquals(100, nStoredLoopFinalValue);
    }

    @Test
    public void testGetLoopFinalizationPoint()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        LoopFinalizer loopFinalizer = new LoopFinalizer(100);
        Field field = loopFinalizer.getClass().getDeclaredField("nStoredLoopFinalValue");
        field.setAccessible(true);
        field.set(loopFinalizer, 100);
         
        // Invoke the method
         
        int i = loopFinalizer.getLoopFinalizationPoint();
         
        // Assert the return value
         
        Assert.assertEquals(100, i);
    }

}
