package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.data;

import java.util.List;
import java.util.ArrayList;

/**
 * ResultCollection for Action
 */
public class ActionResultCollection<T> implements ResultCollection<T> {
    private final List<T> _results;

    public ActionResultCollection() {
        this._results = new ArrayList<>();
    }

    public List<T> getResults() {
        return this._results;
    }
    public void addResult(T result) {
        this._results.add(result);
    }
}