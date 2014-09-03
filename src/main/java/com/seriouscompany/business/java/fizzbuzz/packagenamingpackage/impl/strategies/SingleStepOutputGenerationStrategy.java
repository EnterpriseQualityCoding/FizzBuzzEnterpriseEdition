package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzBuzzOutputGenerationContextVisitorFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.ModuleRegistry;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors.FizzBuzzOutputGenerationContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.DataPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.OutputGenerationContextVisitorFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules.Module;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.SingleStepOutputGenerationParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

public class SingleStepOutputGenerationStrategy {

	private List<OutputGenerationContext> contexts = new ArrayList<OutputGenerationContext>();
	private OutputGenerationContextVisitor contextVisitor;

	public SingleStepOutputGenerationStrategy() {
		final FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		final FizzBuzzOutputStrategy outputStrategy = factory.createOutputStrategy();
        for (Module module : ModuleRegistry.getModules()) {
            final IsEvenlyDivisibleStrategyFactory myStrategyFactory = module.getStrategyFactory();
            final DataPrinterFactory myPrinterFactory = module.getPrinterFactory();
            contexts.add(new FizzBuzzOutputGenerationContext(myStrategyFactory.createIsEvenlyDivisibleStrategy(), 
                                                             myPrinterFactory.createPrinter(outputStrategy)));
        }

		OutputGenerationContextVisitorFactory contextVisitorFactory = new FizzBuzzOutputGenerationContextVisitorFactory();
		contextVisitor = contextVisitorFactory.createVisitor();
    }

	public void performGenerationForCurrentStep(SingleStepOutputGenerationParameter generationParameter) {
		final int nGenerationParameter = generationParameter.retrieveIntegerValue();
		Iterator<OutputGenerationContext> iterator = contexts.iterator();
		while(iterator.hasNext()) {
			OutputGenerationContext context = iterator.next();
			contextVisitor.visit(context, nGenerationParameter);
		}
	}
}
