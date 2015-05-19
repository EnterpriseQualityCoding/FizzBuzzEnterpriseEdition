
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestBuzzStringReturner {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        BuzzStringReturner buzzStringReturner = new BuzzStringReturner();
    }

    @Test
    public void testGetReturnString() {
        BuzzStringReturner buzzStringReturner = new BuzzStringReturner();
         
        // Invoke the method
         
        String string = buzzStringReturner.getReturnString();
         
        // Assert the return value
         
        Assert.assertEquals("Buzz", string);
    }

}
