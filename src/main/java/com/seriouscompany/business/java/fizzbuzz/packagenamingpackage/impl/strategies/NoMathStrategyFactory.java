package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;
/**
 * File copyright 9/25/13 by Stephen Beitzel
 */

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.BuzzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.FizzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.IntegerIntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.NewLineStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

/**
 * <p>Factory for the NoMathStrategy implementation.</p>
 * <p>Implementation note: this initial implementation does not use factories or strategies to obtain its
 * printers. This is because the framework for specifying these is in flux. When the architect has finished
 * all the IOC junkets, this can be cleaned up. Meanwhile, engineering marketing support can say that this
 * factory is streamlined and business development can say that this is a negotiating point for sales.</p>
 *
 * @author Stephen Beitzel &lt;sbeitzel@pobox.com&gt;
 */
public class NoMathStrategyFactory  implements FizzBuzzSolutionStrategyFactory {

    @Override
    public FizzBuzzSolutionStrategy createFizzBuzzSolutionStrategy() {
        return new FizzBuzzSolutionStrategy() {
            @Override
            public void runSolution(int nFizzBuzzUpperLimit) {
                int fStep = 1, bStep = 1;
                StringPrinter buzz = new BuzzStringPrinter();
                StringPrinter fizz = new FizzStringPrinter();
                IntegerPrinter num  = new IntegerIntegerPrinter();
                NewLineStringPrinter nl = new NewLineStringPrinter();
                for (int i = 1; i <= nFizzBuzzUpperLimit; i++) {
                    boolean printInt = true;
                    if (fStep == 3) {
                        fizz.print();
                        fStep = 0;
                        printInt = false;
                    }
                    if (bStep == 5) {
                        buzz.print();
                        bStep = 0;
                        printInt = false;
                    }
                    if (printInt) {
                        num.printInteger(i);
                    }
                    nl.print();
                    fStep++;
                    bStep++;
                }
            }
        };
    }
}
