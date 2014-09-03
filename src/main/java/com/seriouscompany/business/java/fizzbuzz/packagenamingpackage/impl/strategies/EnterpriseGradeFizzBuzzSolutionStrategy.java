package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopRunner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzParameterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

public class EnterpriseGradeFizzBuzzSolutionStrategy implements FizzBuzzSolutionStrategy {

    @Override
    public void runSolution(final FizzBuzzParameterFactory parameterFactory) {
        final LoopContext loopContext = new LoopContext(parameterFactory);
        final SingleStepPayload stepPayload = new SingleStepPayload();
        final LoopRunner loopRunner = new LoopRunner(loopContext, loopContext, stepPayload);
        loopRunner.runLoop();
    }

}
