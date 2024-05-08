package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.json;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.JsonReaderFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonLoader;

public class JsonLoaderImpl implements JsonLoader {
    private InputStream inputStream;
    void loadJson(InputStream inputStream) {
        this.inputStream = inputStream;
    }
    JsonReaderFactory getJsonReaderFactory() {
        return new JsonReaderImplFactory(inputStream);
    }
}