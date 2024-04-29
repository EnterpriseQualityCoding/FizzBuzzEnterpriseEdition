package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopInitializer;

/**
 * Conditional LoopInitializer
 */
@Service
public class ConditionalLoopInitializer implements LoopInitializer {
	/**
	 * @return int
	 */
	public int getLoopInitializationPoint() {
		throw new UnsupportedOperationException(Constants.A_CONDITIONAL_LOOP_HAS_NO_INITIALIZATION_POINT);
	}
}
