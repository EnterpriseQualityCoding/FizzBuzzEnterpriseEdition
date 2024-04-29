package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.*;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors.FizzBuzzOutputGenerationContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.OutputGenerationStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.SingleStepOutputGenerationParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.data.ResultCollection;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.data.ActionResultCollection;

/**
 * Strategy for SingleStepOutputGeneration
 */
@Service
public class SingleStepOutputGenerationStrategy implements OutputGenerationStrategy {

	private final List<OutputGenerationContext> contexts;
	private final OutputGenerationContextVisitor contextVisitor;
	private final StringPrinter myNewLinePrinter;

	/**
	 * @param fizzBuzzOutputGenerationContextVisitorFactory FizzBuzzOutputGenerationContextVisitorFactory
	 * @param fizzStrategyFactory FizzStrategyFactory
	 * @param fizzStringPrinterFactory FizzStringPrinterFactory
	 * @param buzzStrategyFactory BuzzStrategyFactory
	 * @param buzzStringPrinterFactory BuzzStringPrinterFactory
	 * @param noFizzNoBuzzStrategyFactory NoFizzNoBuzzStrategyFactory
	 * @param integerIntegerPrinterFactory IntegerIntegerPrinterFactory
	 * @param newLineStringPrinterFactory NewLineStringPrinterFactory
	 */
	@Autowired
	public SingleStepOutputGenerationStrategy(
			final FizzBuzzOutputGenerationContextVisitorFactory fizzBuzzOutputGenerationContextVisitorFactory,
			final FizzStrategyFactory fizzStrategyFactory,
			final FizzStringPrinterFactory fizzStringPrinterFactory,
			final BuzzStrategyFactory buzzStrategyFactory,
			final BuzzStringPrinterFactory buzzStringPrinterFactory,
			final NoFizzNoBuzzStrategyFactory noFizzNoBuzzStrategyFactory,
			final IntegerIntegerPrinterFactory integerIntegerPrinterFactory,
			final NewLineStringPrinterFactory newLineStringPrinterFactory) {
		super();
		this.contextVisitor = fizzBuzzOutputGenerationContextVisitorFactory.createVisitor();
		this.contexts = new ArrayList<OutputGenerationContext>();
		this.contexts.add(new FizzBuzzOutputGenerationContext(fizzStrategyFactory.createIsEvenlyDivisibleStrategy(),
				fizzStringPrinterFactory.createStringPrinter()));
		this.contexts.add(new FizzBuzzOutputGenerationContext(buzzStrategyFactory.createIsEvenlyDivisibleStrategy(),
				buzzStringPrinterFactory.createStringPrinter()));
		this.contexts.add(new FizzBuzzOutputGenerationContext(
				noFizzNoBuzzStrategyFactory.createIsEvenlyDivisibleStrategy(),
				integerIntegerPrinterFactory.createPrinter()));

		this.myNewLinePrinter = newLineStringPrinterFactory.createStringPrinter();
	}

	/**
	 * @param generationParameter SingleStepOutputGenerationParameter
	 * @return void
	 */
	public void performGenerationForCurrentStep(final SingleStepOutputGenerationParameter generationParameter) {
		final Iterator<OutputGenerationContext> iterator = this.contexts.iterator();
		final ResultCollectionFactory<OutputGenerationContext> resultCollectionFactory = new ActionResultCollectionFactory<>();
		// switch to ConditionalLoop
		while (iterator.hasNext()) {
			final OutputGenerationContext context = iterator.next();
			this.contextVisitor.visit(context, nGenerationParameter);
		}
		//
		final ResultCollection<OutputGenerationContext> results = resultCollectionFactory.createResultCollection();
		final IteratorPayload<OutputGenerationContext> iteratorPayload = new IteratorPayload<>(iterator, results);
		//end
		this.myNewLinePrinter.print();
	}

	private void generateResultCollection(Iterator<OutputGenerationContext> iterator, IteratorPayload<OutputGenerationContext> iteratorPayload) {
		final ConditionalLoopContext loopContext = new ConditionalLoopContext(iterator::hasNext);
		final ConditionalLoopRunner loopRunner = new ConditionalLoopRunner(loopContext, loopContext, iteratorPayload);
		loopRunner.runLoop();
	}

	private void generateOutputFromResultCollection(ResultCollection<OutputGenerationContext> results, final OutputGenerationContextVisitor contextVisitor, final SingleStepOutputGenerationParameter nGenerationParameter) {
		final OutputGenerationContextVisitorPayload outputGenerationContextVisitorPayload = new OutputGenerationContextVisitorPayload();
		final CountBasedLoopContext loopContext = new CountBasedLoopContext(results.size());
		final CountBasedLoopRunner loopRunner = new CountBasedLoopRunner(loopContext, loopContext, outputGenerationContextVisitorPayload);
		loopRunner.runLoop();
	}
}
