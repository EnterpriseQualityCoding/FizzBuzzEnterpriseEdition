package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopFinalizer;

/**
 * Conditional LoopFinalizer
 */
public final class ConditionalLoopFinalizer implements LoopFinalizer {
    /**
	 * @return int
	 */
	public int getLoopFinalizationPoint() {
		throw new UnsupportedOperationException(Constants.A_CONDITIONAL_LOOP_HAS_NO_FINALIZATION_POINT);
	}
}
