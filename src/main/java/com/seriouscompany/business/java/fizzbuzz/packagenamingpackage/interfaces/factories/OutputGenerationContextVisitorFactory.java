package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

import javax.annotation.Nonnull;

public interface OutputGenerationContextVisitorFactory {
	@Nonnull
	public OutputGenerationContextVisitor createVisitor();
}
