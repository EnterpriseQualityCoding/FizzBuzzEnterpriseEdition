package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzParameterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzLowerLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzStepParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopContext;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop.LoopRunner;

public class EnterpriseGradeFizzBuzzSolutionStrategy implements FizzBuzzSolutionStrategy {

    @Override
    public void runSolution(final FizzBuzzParameterFactory parameterFactory) {
        final LoopContext loopContext = new LoopContext(parameterFactory);
        final SingleStepPayload stepPayload = new SingleStepPayload();
        final LoopRunner loopRunner = new LoopRunner(loopContext, loopContext, stepPayload);
        loopRunner.runLoop();
    }

}
