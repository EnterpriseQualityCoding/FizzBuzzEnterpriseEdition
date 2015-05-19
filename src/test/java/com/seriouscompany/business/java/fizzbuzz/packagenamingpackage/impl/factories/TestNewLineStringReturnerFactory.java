
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import java.lang.reflect.Field;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestNewLineStringReturnerFactory {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        NewLineStringReturnerFactory newLineStringReturnerFactory = new NewLineStringReturnerFactory();
    }

    @Test
    public void testCreateStringStringReturner()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        NewLineStringReturner mockNewLineStringReturner = Mockito.mock(NewLineStringReturner.class);
        NewLineStringReturnerFactory newLineStringReturnerFactory = new NewLineStringReturnerFactory();
        Field field = newLineStringReturnerFactory.getClass().getDeclaredField("_newlineStringReturner");
        field.setAccessible(true);
        field.set(newLineStringReturnerFactory, mockNewLineStringReturner);
         
        // Invoke the method
         
        StringStringReturner stringStringReturner = newLineStringReturnerFactory.createStringStringReturner();
         
        // Assert that our method interactions are what we expect.
         
    }

}
