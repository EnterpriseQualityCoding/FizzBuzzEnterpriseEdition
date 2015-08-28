
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestLoopInitializer {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        LoopInitializer loopInitializer = new LoopInitializer();
    }

    @Test
    public void testGetLoopInitializationPoint() {
        LoopInitializer loopInitializer = new LoopInitializer();
         
        // Invoke the method
         
        int i = loopInitializer.getLoopInitializationPoint();
         
        // Assert the return value
         
        Assert.assertEquals(1, i);
    }

}
