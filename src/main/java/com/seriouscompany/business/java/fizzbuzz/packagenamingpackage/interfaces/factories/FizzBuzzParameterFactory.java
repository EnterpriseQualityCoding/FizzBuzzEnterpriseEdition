package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzLowerLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzStepParameter;

public interface FizzBuzzParameterFactory {

    public FizzBuzzLowerLimitParameter createLowerLimitParameter();
    public FizzBuzzUpperLimitParameter createUpperLimitParameter();
    public FizzBuzzStepParameter createStepParameter();

}
