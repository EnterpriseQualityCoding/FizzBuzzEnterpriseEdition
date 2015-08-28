
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestLoopStep {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        LoopStep loopStep = new LoopStep();
    }

    @Test
    public void testStepLoop() {
         
        // Generate the arguments
         
        LoopStep loopStep = new LoopStep();
         
        // Invoke the method
         
        int i = loopStep.stepLoop(100);
         
        // Assert the return value
         
        Assert.assertEquals(101, i);
    }

}
