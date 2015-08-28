
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopFinalizer;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestLoopComponentFactory {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        LoopComponentFactory loopComponentFactory = new LoopComponentFactory();
    }

    @Test
    public void testCreateLoopFinalizer() {
         
        // Generate the arguments
         
        LoopComponentFactory loopComponentFactory = new LoopComponentFactory();
         
        // Invoke the method
         
        LoopFinalizer loopFinalizer = loopComponentFactory.createLoopFinalizer(100);
    }

}
