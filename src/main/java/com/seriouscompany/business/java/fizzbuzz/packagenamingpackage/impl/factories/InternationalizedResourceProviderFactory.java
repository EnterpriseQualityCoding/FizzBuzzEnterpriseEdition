package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.resources.InternationalizedResourceProvider;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.ResourceProviderFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.resources.ResourceProvider;

public class InternationalizedResourceProviderFactory implements ResourceProviderFactory{

    @Override
    public ResourceProvider createResourceProvider() {
        return new InternationalizedResourceProvider();
    }

}
