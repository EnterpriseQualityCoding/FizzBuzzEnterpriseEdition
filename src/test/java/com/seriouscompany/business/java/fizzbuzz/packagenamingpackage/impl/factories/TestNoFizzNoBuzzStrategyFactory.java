
package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestNoFizzNoBuzzStrategyFactory {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        NoFizzNoBuzzStrategyFactory noFizzNoBuzzStrategyFactory = new NoFizzNoBuzzStrategyFactory();
    }

    @Test
    public void testCreateIsEvenlyDivisibleStrategy() {
        NoFizzNoBuzzStrategyFactory noFizzNoBuzzStrategyFactory = new NoFizzNoBuzzStrategyFactory();
         
        // Invoke the method
         
        IsEvenlyDivisibleStrategy isEvenlyDivisibleStrategy = noFizzNoBuzzStrategyFactory.createIsEvenlyDivisibleStrategy();
    }

}
