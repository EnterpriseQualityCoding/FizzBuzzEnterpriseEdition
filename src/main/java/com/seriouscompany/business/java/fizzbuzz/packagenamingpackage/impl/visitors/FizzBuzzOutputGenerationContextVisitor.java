package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

public class FizzBuzzOutputGenerationContextVisitor implements
		OutputGenerationContextVisitor {

	@Override
	public void visit(final OutputGenerationContext context, final int nGenerationParameter) {
		if (context.getStrategy().isEvenlyDivisible(nGenerationParameter)) {
			context.getPrinter().printValue(new Integer(nGenerationParameter));
		}
	}

}
