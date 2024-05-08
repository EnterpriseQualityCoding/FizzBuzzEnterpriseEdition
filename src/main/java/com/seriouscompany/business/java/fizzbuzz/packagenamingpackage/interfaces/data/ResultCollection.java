package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.data;

import java.util.List;

/**
 * ResultCollection
 */
public interface ResultCollection<T> {
    public List<Result<T>> getResults();
    public void addResult(Result<T> result);
}