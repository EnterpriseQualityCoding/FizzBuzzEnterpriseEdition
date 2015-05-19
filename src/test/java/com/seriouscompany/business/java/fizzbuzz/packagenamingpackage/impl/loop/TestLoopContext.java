
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import java.lang.reflect.Field;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestLoopContext {


    @Test
    public void testConstructor() {
         
        // Generate the arguments
         
         
        // Invoke the method
         
        LoopContext loopContext = new LoopContext(100);
         
        // Assert the fields are what we expect
         
    }

    @Test
    public void testStart()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        LoopInitializer mockLoopInitializer = Mockito.mock(LoopInitializer.class);
        Mockito.when(mockLoopInitializer.getLoopInitializationPoint()).thenReturn(1);
        LoopContext loopContext = new LoopContext(100);
        Field field = loopContext.getClass().getDeclaredField("myLoopInitializer");
        field.set(loopContext, mockLoopInitializer);
         
        // Invoke the method
         
        loopContext.start();
         
        // Assert the fields are what we expect
         
        Field field1 = loopContext.getClass().getDeclaredField("myCurrentControlParameterValue");
        int myCurrentControlParameterValue = ((int) field1 .get(loopContext));
        Assert.assertEquals(1, myCurrentControlParameterValue);
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockLoopInitializer, Mockito.times(1)).getLoopInitializationPoint();
    }

    @Test
    public void testShouldProceed()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        LoopCondition mockLoopCondition = Mockito.mock(LoopCondition.class);
        Mockito.when(mockLoopCondition.evaluateLoop(Mockito.eq(101), Mockito.eq(100))).thenReturn(false);
        LoopFinalizer mockLoopFinalizer = Mockito.mock(LoopFinalizer.class);
        Mockito.when(mockLoopFinalizer.getLoopFinalizationPoint()).thenReturn(100);
        LoopContext loopContext = new LoopContext(100);
        Field field = loopContext.getClass().getDeclaredField("myCurrentControlParameterValue");
        field.set(loopContext, 101);
        Field field1 = loopContext.getClass().getDeclaredField("myLoopCondition");
        field1 .set(loopContext, mockLoopCondition);
        Field field2 = loopContext.getClass().getDeclaredField("myLoopFinalizer");
        field2 .set(loopContext, mockLoopFinalizer);
         
        // Invoke the method
         
        boolean b = loopContext.shouldProceed();
         
        // Assert the return value
         
        Assert.assertEquals(false, b);
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockLoopCondition, Mockito.times(1)).evaluateLoop(Mockito.eq(101), Mockito.eq(100));
        Mockito.verify(mockLoopFinalizer, Mockito.times(1)).getLoopFinalizationPoint();
    }

    @Test
    public void testGetControlParameter()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        LoopContext loopContext = new LoopContext(100);
        Field field = loopContext.getClass().getDeclaredField("myCurrentControlParameterValue");
        field.set(loopContext, 100);
         
        // Invoke the method
         
        int i = loopContext.getControlParameter();
         
        // Assert the return value
         
        Assert.assertEquals(100, i);
    }

    @Test
    public void testProceed()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        LoopStep mockLoopStep = Mockito.mock(LoopStep.class);
        Mockito.when(mockLoopStep.stepLoop(Mockito.eq(100))).thenReturn(101);
        LoopContext loopContext = new LoopContext(100);
        Field field = loopContext.getClass().getDeclaredField("myCurrentControlParameterValue");
        field.set(loopContext, 100);
        Field field1 = loopContext.getClass().getDeclaredField("myLoopStep");
        field1 .set(loopContext, mockLoopStep);
         
        // Invoke the method
         
        loopContext.proceed();
         
        // Assert the fields are what we expect
         
        Field field2 = loopContext.getClass().getDeclaredField("myCurrentControlParameterValue");
        int myCurrentControlParameterValue = ((int) field2 .get(loopContext));
        Assert.assertEquals(101, myCurrentControlParameterValue);
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockLoopStep, Mockito.times(1)).stepLoop(Mockito.eq(100));
    }

}
