package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.BuzzPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.FizzPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.IntPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.printers.NewLinePrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.strategies.BuzzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.strategies.FizzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.strategies.NoFizzNoBuzzStrategy;

public class FizzBuzz {
	public void fizzbuzz(int n) {
		LoopInitializer li = new LoopInitializer();
		LoopCondition lc = new LoopCondition();
		LoopStep ls = new LoopStep();
		
		FizzStrategy fs = new FizzStrategy();
		FizzPrinter fp = new FizzPrinter();
		
		BuzzStrategy bs = new BuzzStrategy();	
		BuzzPrinter bp = new BuzzPrinter();
		
		NoFizzNoBuzzStrategy nfnbs = new NoFizzNoBuzzStrategy();
		IntPrinter ip = new IntPrinter();
		
		NewLinePrinter nlp = new NewLinePrinter();
		
		for (int i = li.getLoopInitializationPoint(); lc.evaluateLoop(i, n); i = ls.stepLoop(i)) {
			if (fs.isEvenlyDivisible(i)) { 
				fp.printFizz();
			}
			if (bs.isEvenlyDivisible(i)) { 
				bp.printBuzz();
			}
			if (nfnbs.isEvenlyDivisible(i)) {
				ip.printInteger(i);
			}
			nlp.printNewLine();
		}
	}
}
