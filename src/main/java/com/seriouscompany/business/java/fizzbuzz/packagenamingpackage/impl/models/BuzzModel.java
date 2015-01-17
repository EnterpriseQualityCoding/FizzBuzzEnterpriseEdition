package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.models;

public class BuzzModel extends Model implements com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.models.Model {

    public final static String BUZZ = "Buzz";
    private final String modelValue;

    public BuzzModel(String modelValue) {
        this.modelValue = modelValue;
    }

    public BuzzModel() {
        this.modelValue = BUZZ;
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

        public BuzzModel build() {
            return new BuzzModel(modelValue);
        }
    }
}
