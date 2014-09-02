package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzBuzzOutputGenerationContextVisitorFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.IntIntegerPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NewLineStringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.NoFizzNoBuzzStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors.FizzBuzzOutputGenerationContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.OutputGenerationContextVisitorFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.SingleStepOutputGenerationParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

public class SingleStepOutputGenerationStrategy {

	private List<OutputGenerationContext> contexts = new ArrayList<OutputGenerationContext>();
	private OutputGenerationContextVisitor contextVisitor;

	private StringPrinter myNewLinePrinter;

	public SingleStepOutputGenerationStrategy() {
		OutputGenerationContextVisitorFactory contextVisitorFactory = new FizzBuzzOutputGenerationContextVisitorFactory();
		contextVisitor = contextVisitorFactory.createVisitor(); 
		final IsEvenlyDivisibleStrategyFactory myFizzStrategyFactory = new FizzStrategyFactory();
		final StringPrinterFactory myFizzStringPrinterFactory = new FizzStringPrinterFactory();
		contexts.add(new FizzBuzzOutputGenerationContext(myFizzStrategyFactory.createIsEvenlyDivisibleStrategy(), myFizzStringPrinterFactory.createStringPrinter()));

		final IsEvenlyDivisibleStrategyFactory myBuzzStrategyFactory = new BuzzStrategyFactory();
		final StringPrinterFactory myBuzzStringPrinterFactory = new BuzzStringPrinterFactory();
		contexts.add(new FizzBuzzOutputGenerationContext(myBuzzStrategyFactory.createIsEvenlyDivisibleStrategy(), myBuzzStringPrinterFactory.createStringPrinter()));

		final IsEvenlyDivisibleStrategyFactory myNoFizzNoBuzzStrategyFactory = new NoFizzNoBuzzStrategyFactory();
		final IntegerPrinterFactory myIntIntegerPrinterFactory = new IntIntegerPrinterFactory();
		contexts.add(new FizzBuzzOutputGenerationContext(myNoFizzNoBuzzStrategyFactory.createIsEvenlyDivisibleStrategy(), myIntIntegerPrinterFactory.createPrinter()));

		final StringPrinterFactory myNewLineStringPrinterFactory = new NewLineStringPrinterFactory();
		myNewLinePrinter = myNewLineStringPrinterFactory.createStringPrinter();
    }

	public void performGenerationForCurrentStep(SingleStepOutputGenerationParameter generationParameter) {
		final int nGenerationParameter = generationParameter.retrieveIntegerValue();
		Iterator<OutputGenerationContext> iterator = contexts.iterator();
		while(iterator.hasNext()) {
			OutputGenerationContext context = iterator.next();
			contextVisitor.visit(context, nGenerationParameter);
		}
		myNewLinePrinter.print();
	}
}
