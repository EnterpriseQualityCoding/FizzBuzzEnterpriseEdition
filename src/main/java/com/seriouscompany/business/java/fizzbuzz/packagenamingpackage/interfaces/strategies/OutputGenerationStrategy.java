package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies;

import javax.annotation.Nonnull;

public interface OutputGenerationStrategy {
	void performGenerationForCurrentStep(@Nonnull SingleStepOutputGenerationParameter generationParameter);
}
