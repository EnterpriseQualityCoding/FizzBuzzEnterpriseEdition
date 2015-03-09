package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.InternationalizedResourceProviderFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.ResourceProviderFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.resources.ResourceProvider;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

public class BuzzPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;
    private final ResourceProvider myResourceProvider;

	public BuzzPrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
        ResourceProviderFactory myResourceProviderFactory = new InternationalizedResourceProviderFactory();
        myResourceProvider = myResourceProviderFactory.createResourceProvider();
	}

	public void printBuzz() {
		final BuzzStringReturner myBuzzStringReturner = new BuzzStringReturner(myResourceProvider);
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(outputStrategy);

		myOutputAdapter.output(myBuzzStringReturner.getReturnString());
	}
}
