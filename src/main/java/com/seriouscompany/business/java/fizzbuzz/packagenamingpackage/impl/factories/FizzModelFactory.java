package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.models.FizzModel;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.ModelFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.models.Model;

public class FizzModelFactory implements ModelFactory {

    @Override
    public Model createModel() {
        return new FizzModel.Builder().modelValue(FizzModel.FIZZ).build();
    }
}
