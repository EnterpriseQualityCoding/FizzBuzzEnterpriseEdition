package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;

@Service
public class LoopInitializer {

	public int getLoopInitializationPoint() {
		return Constants.LOOP_INIT_VALUE;
	}

}
