package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.models;

public class FizzModel extends Model implements com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.models.Model {

    public final static String FIZZ = "Fizz";
    private final String modelValue;

    public FizzModel(String modelValue) {
        this.modelValue = modelValue;
    }

    public FizzModel() {
        this.modelValue = FIZZ;
    }

    @Override
    public String getValue() {
        return modelValue;
    }

    public static class Builder {

        private String modelValue;

        public Builder modelValue(String modelValue) {
            this.modelValue = modelValue;
            return this;
        }

        public FizzModel build() {
            return new FizzModel(modelValue);
        }
    }
}
