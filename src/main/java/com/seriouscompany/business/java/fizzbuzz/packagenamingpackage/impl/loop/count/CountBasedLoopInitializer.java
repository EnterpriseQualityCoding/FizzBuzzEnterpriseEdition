package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;

/**
 * Count-based LoopInitializer
 */
@Service
public class CountBasedLoopInitializer implements LoopInitializer {
	
	/**
	 * @return int
	 */
	public int getLoopInitializationPoint() {
		return Constants.LOOP_INIT_VALUE;
	}

}
