
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.SingleStepPayload;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;


/**
 * Generated Unit Tests
 * 
 */
public class TestLoopRunner {


    @Test
    public void testConstructor()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the arguments
         
        LoopContext mockretrievalObjectToAdapt = Mockito.mock(LoopContext.class);
        LoopContext mockretrievalObjectToAdapt1 = Mockito.mock(LoopContext.class);
        SingleStepPayload mockpayload = Mockito.mock(SingleStepPayload.class);
         
        // Invoke the method
         
        LoopRunner loopRunner = new LoopRunner(mockretrievalObjectToAdapt, mockretrievalObjectToAdapt1, mockpayload);
         
        // Assert the fields are what we expect
         
        Field field = loopRunner.getClass().getDeclaredField("myPayload");
        field.setAccessible(true);
        SingleStepPayload myPayload = ((SingleStepPayload) field.get(loopRunner));
        Assert.assertEquals(mockpayload, myPayload);
        Field field1 = loopRunner.getClass().getDeclaredField("myStateManipulation");
        field1 .setAccessible(true);
        LoopContext myStateManipulation = ((LoopContext) field1 .get(loopRunner));
        Assert.assertEquals(mockretrievalObjectToAdapt, myStateManipulation);
         
        // Assert that our method interactions are what we expect.
         
    }

}
