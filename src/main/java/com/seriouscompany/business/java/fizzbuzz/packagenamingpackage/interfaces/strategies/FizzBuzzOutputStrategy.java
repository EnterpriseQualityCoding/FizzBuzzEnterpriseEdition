package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies;

import javax.annotation.Nonnull;
import java.io.IOException;

public interface FizzBuzzOutputStrategy {
	
	public void output(@Nonnull String output) throws IOException;
	
}
