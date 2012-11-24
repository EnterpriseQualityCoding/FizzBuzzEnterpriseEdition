package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.loop.LoopCondition;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.loop.LoopInitializer;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.loop.LoopStep;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.BuzzPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.FizzPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.IntPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.NewLinePrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.strategies.BuzzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.strategies.FizzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.strategies.NoFizzNoBuzzStrategy;

public class FizzBuzz {
	public void fizzbuzz(int n) {
		LoopInitializer myLoopInitializer = new LoopInitializer();
		LoopCondition myLoopCondition = new LoopCondition();
		LoopStep myLoopStep = new LoopStep();
		
		FizzStrategy myFizzStrategy = new FizzStrategy();
		FizzPrinter myFizzPrinter = new FizzPrinter();
		
		BuzzStrategy myBuzzStrategy = new BuzzStrategy();	
		BuzzPrinter myBuzzPrinter = new BuzzPrinter();
		
		NoFizzNoBuzzStrategy myNoFizzNoBuzzStrategy = new NoFizzNoBuzzStrategy();
		IntPrinter myIntPrinter = new IntPrinter();
		
		NewLinePrinter myNewLinePrinter = new NewLinePrinter();
		
		for (int i = myLoopInitializer.getLoopInitializationPoint(); myLoopCondition.evaluateLoop(i, n); i = myLoopStep.stepLoop(i)) {
			if (myFizzStrategy.isEvenlyDivisible(i)) { 
				myFizzPrinter.printFizz();
			}
			if (myBuzzStrategy.isEvenlyDivisible(i)) { 
				myBuzzPrinter.printBuzz();
			}
			if (myNoFizzNoBuzzStrategy.isEvenlyDivisible(i)) {
				myIntPrinter.printInteger(i);
			}
			myNewLinePrinter.printNewLine();
		}
	}
}
