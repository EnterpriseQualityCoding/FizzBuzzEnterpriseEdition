package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

/**
 * Factory for OutputGenerationContextVisitor
 */
public interface OutputGenerationContextVisitorFactory {

	/**
	 * @return
	 */
	public OutputGenerationContextVisitor createVisitor();

}
