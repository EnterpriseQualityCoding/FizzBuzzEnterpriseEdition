
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import java.lang.reflect.Field;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.LoopContextStateRetrievalToSingleStepOutputGenerationAdapter;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestSingleStepPayload {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        SingleStepPayload singleStepPayload = new SingleStepPayload();
    }

    @Test
    public void testRunLoopPayload()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the arguments
         
        LoopContext mockretrievalObjectToAdapt = Mockito.mock(LoopContext.class);
         
        // Generate the fields
         
        SingleStepOutputGenerationStrategy mockSingleStepOutputGenerationStrategy = Mockito.mock(SingleStepOutputGenerationStrategy.class);
        SingleStepPayload singleStepPayload = new SingleStepPayload();
        Field field = singleStepPayload.getClass().getDeclaredField("_outputGenerationStrategy");
        field.set(singleStepPayload, mockSingleStepOutputGenerationStrategy);
         
        // Invoke the method
         
        singleStepPayload.runLoopPayload(mockretrievalObjectToAdapt);
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockSingleStepOutputGenerationStrategy, Mockito.times(1)).performGenerationForCurrentStep(Mockito.any(LoopContextStateRetrievalToSingleStepOutputGenerationAdapter.class));
    }

}
