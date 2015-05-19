
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 */
public class TestNewLineStringReturner {


    @Test
    public void testConstructor() {

        // Invoke the method

        NewLineStringReturner newLineStringReturner = new NewLineStringReturner();
    }

    @Test
    public void testGetReturnString() {
        NewLineStringReturner newLineStringReturner = new NewLineStringReturner();

        // Invoke the method

        String string = newLineStringReturner.getReturnString();

        // Assert the return value

        Assert.assertEquals("\n", string);
    }

}
