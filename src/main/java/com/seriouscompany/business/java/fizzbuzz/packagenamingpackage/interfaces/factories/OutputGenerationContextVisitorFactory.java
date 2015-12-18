package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

public interface OutputGenerationContextVisitorFactory {

	/**
	 * @return
     */
	public OutputGenerationContextVisitor createVisitor();
}
