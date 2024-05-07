package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.JsonReaderFactory;

public interface JsonLoader {
    void loadJson(InputStream inputStream);
    JsonReaderFactory getJsonReaderFactory();
}