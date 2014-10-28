package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.*;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors.FizzBuzzOutputGenerationContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.OutputGenerationContextVisitorFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.SingleStepOutputGenerationParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

import java.util.ArrayList;
import java.util.List;

public class SingleStepOutputGenerationStrategy {

	private final List<OutputGenerationContext> contexts = new ArrayList<OutputGenerationContext>();
    private final OutputGenerationContextVisitor contextVisitor;

    private final StringPrinter myNewLinePrinter;

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
		myNewLinePrinter = myNewLineStringPrinterFactory.createStringPrinter();	}

	public void performGenerationForCurrentStep(SingleStepOutputGenerationParameter generationParameter) {
		final int nGenerationParameter = generationParameter.retrieveIntegerValue();
        for (OutputGenerationContext context : contexts) {
            contextVisitor.visit(context, nGenerationParameter);
        }
		myNewLinePrinter.print();
	}
}
