package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors;

/**
 * Visitor for OutputGenerationContext
 */
public interface OutputGenerationContextVisitor {

	/**
	 * @param context
	 * @param nGenerationParameter
	 */
	public void visit(OutputGenerationContext context, int nGenerationParameter);

}
