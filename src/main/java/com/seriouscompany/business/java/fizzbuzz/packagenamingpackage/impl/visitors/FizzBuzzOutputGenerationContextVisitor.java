package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.DataPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

@Service
public class FizzBuzzOutputGenerationContextVisitor implements
		OutputGenerationContextVisitor {

	@Override
	public void visit(final OutputGenerationContext context, final int nGenerationParameter) {
		final IsEvenlyDivisibleStrategy strategy = context.getStrategy();
		if (strategy.isEvenlyDivisible(nGenerationParameter)) {
			final DataPrinter printer = context.getPrinter();
			printer.printValue(new Integer(nGenerationParameter));
		}
	}

}
