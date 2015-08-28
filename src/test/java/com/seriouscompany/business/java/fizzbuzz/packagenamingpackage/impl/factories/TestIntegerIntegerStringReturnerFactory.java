
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import java.lang.reflect.Field;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Generated Unit Tests
 * 
 */
public class TestIntegerIntegerStringReturnerFactory {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        IntegerIntegerStringReturnerFactory integerIntegerStringReturnerFactory = new IntegerIntegerStringReturnerFactory();
    }

    @Test
    public void testCreateIntegerStringReturner()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        IntegerIntegerStringReturner mockIntegerIntegerStringReturner = Mockito.mock(IntegerIntegerStringReturner.class);
        IntegerIntegerStringReturnerFactory integerIntegerStringReturnerFactory = new IntegerIntegerStringReturnerFactory();
        Field field = integerIntegerStringReturnerFactory.getClass().getDeclaredField("_integerIntegerStringReturner");
        field.setAccessible(true);
        field.set(integerIntegerStringReturnerFactory, mockIntegerIntegerStringReturner);
         
        // Invoke the method
         
        IntegerStringReturner integerStringReturner = integerIntegerStringReturnerFactory.createIntegerStringReturner();
         
        // Assert that our method interactions are what we expect.
         
    }

}
