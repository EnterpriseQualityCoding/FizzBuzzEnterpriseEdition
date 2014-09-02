package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzParameterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzLowerLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzStepParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters.DefaultFizzBuzzUpperLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters.DefaultFizzBuzzLowerLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.parameters.DefaultFizzBuzzStepParameter;

public class FizzBuzzDefaultParameterFactory implements FizzBuzzParameterFactory {

    @Override
    public FizzBuzzUpperLimitParameter createUpperLimitParameter() {
        final FizzBuzzUpperLimitParameter upperLimitParameter = new DefaultFizzBuzzUpperLimitParameter();
        return upperLimitParameter;
    }

    @Override
    public FizzBuzzLowerLimitParameter createLowerLimitParameter() {
        final FizzBuzzLowerLimitParameter lowerLimitParameter = new DefaultFizzBuzzLowerLimitParameter();
        return lowerLimitParameter;
    }

    @Override
    public FizzBuzzStepParameter createStepParameter() {
        final FizzBuzzStepParameter stepParameter = new DefaultFizzBuzzStepParameter();
        return stepParameter;
    }

}
