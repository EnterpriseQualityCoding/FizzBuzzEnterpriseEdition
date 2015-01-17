package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.models.BuzzModel;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.ModelFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.models.Model;

public class BuzzModelFactory implements ModelFactory {

    @Override
    public Model createModel() {
        return new BuzzModel.Builder().modelValue(BuzzModel.BUZZ).build();
    }
}
