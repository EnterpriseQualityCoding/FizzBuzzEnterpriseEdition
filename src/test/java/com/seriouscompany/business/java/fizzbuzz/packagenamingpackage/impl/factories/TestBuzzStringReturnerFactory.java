
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import java.lang.reflect.Field;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestBuzzStringReturnerFactory {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        BuzzStringReturnerFactory buzzStringReturnerFactory = new BuzzStringReturnerFactory();
    }

    @Test
    public void testCreateStringStringReturner()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        BuzzStringReturner mockBuzzStringReturner = Mockito.mock(BuzzStringReturner.class);
        BuzzStringReturnerFactory buzzStringReturnerFactory = new BuzzStringReturnerFactory();
        Field field = buzzStringReturnerFactory.getClass().getDeclaredField("_myBuzzStringReturner");
        field.setAccessible(true);
        field.set(buzzStringReturnerFactory, mockBuzzStringReturner);
         
        // Invoke the method
         
        StringStringReturner stringStringReturner = buzzStringReturnerFactory.createStringStringReturner();
         
        // Assert that our method interactions are what we expect.
         
    }

}
