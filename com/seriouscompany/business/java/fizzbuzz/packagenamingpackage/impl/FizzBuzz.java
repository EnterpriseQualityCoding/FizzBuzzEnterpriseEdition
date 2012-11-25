package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.IntIntegerPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.LoopComponentFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NewLineStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NoFizzNoBuzzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopStep;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

public class FizzBuzz {
	public void fizzbuzz(int n) {
		
		LoopComponentFactory myLoopComponentFactory = new LoopComponentFactory();
		LoopInitializer myLoopInitializer = myLoopComponentFactory.createLoopInitializer();
		LoopCondition myLoopCondition = myLoopComponentFactory.createLoopCondition();
		LoopStep myLoopStep = myLoopComponentFactory.createLoopStep();
		
		IsEvenlyDivisibleStrategyFactory myFizzStrategyFactory = new FizzStrategyFactory();
		IsEvenlyDivisibleStrategy myFizzStrategy = myFizzStrategyFactory.createIsEvenlyDivisibleStrategy();
		StringPrinterFactory myFizzStringPrinterFactory = new FizzStringPrinterFactory();
		StringPrinter myFizzStringPrinter = myFizzStringPrinterFactory.createStringPrinter();
		
		IsEvenlyDivisibleStrategyFactory myBuzzStrategyFactory = new BuzzStrategyFactory();
		IsEvenlyDivisibleStrategy myBuzzStrategy = myBuzzStrategyFactory.createIsEvenlyDivisibleStrategy();	
		StringPrinterFactory myBuzzStringPrinterFactory = new BuzzStringPrinterFactory();
		StringPrinter myBuzzStringPrinter = myBuzzStringPrinterFactory.createStringPrinter();
		
		IsEvenlyDivisibleStrategyFactory myNoFizzNoBuzzStrategyFactory = new NoFizzNoBuzzStrategyFactory();
		IsEvenlyDivisibleStrategy myNoFizzNoBuzzStrategy = myNoFizzNoBuzzStrategyFactory.createIsEvenlyDivisibleStrategy();
		IntegerPrinterFactory myIntIntegerPrinterFactory = new IntIntegerPrinterFactory();
		IntegerPrinter myIntIntegerPrinter = myIntIntegerPrinterFactory.createPrinter();
		
		StringPrinterFactory myNewLineStringPrinterFactory = new NewLineStringPrinterFactory();
		StringPrinter myNewLinePrinter = myNewLineStringPrinterFactory.createStringPrinter();
		
		for (int i = myLoopInitializer.getLoopInitializationPoint(); myLoopCondition.evaluateLoop(i, n); i = myLoopStep.stepLoop(i)) {
			if (myFizzStrategy.isEvenlyDivisible(i)) { 
				myFizzStringPrinter.print();
			}
			if (myBuzzStrategy.isEvenlyDivisible(i)) { 
				myBuzzStringPrinter.print();
			}
			if (myNoFizzNoBuzzStrategy.isEvenlyDivisible(i)) {
				myIntIntegerPrinter.printInteger(i);
			}
			myNewLinePrinter.print();
		}
	}
}
