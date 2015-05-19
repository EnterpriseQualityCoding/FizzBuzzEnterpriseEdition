
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import java.lang.reflect.Field;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestFizzStringReturnerFactory {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        FizzStringReturnerFactory fizzStringReturnerFactory = new FizzStringReturnerFactory();
    }

    @Test
    public void testCreateStringStringReturner()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        FizzStringReturner mockFizzStringReturner = Mockito.mock(FizzStringReturner.class);
        FizzStringReturnerFactory fizzStringReturnerFactory = new FizzStringReturnerFactory();
        Field field = fizzStringReturnerFactory.getClass().getDeclaredField("_fizzStringReturner");
        field.setAccessible(true);
        field.set(fizzStringReturnerFactory, mockFizzStringReturner);
         
        // Invoke the method
         
        StringStringReturner stringStringReturner = fizzStringReturnerFactory.createStringStringReturner();
         
        // Assert that our method interactions are what we expect.
         
    }

}
