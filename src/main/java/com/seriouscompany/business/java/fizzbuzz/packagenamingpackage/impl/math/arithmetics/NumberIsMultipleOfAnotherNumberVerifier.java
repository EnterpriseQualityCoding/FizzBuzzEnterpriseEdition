package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics;

public class NumberIsMultipleOfAnotherNumberVerifier {
    public static boolean numberIsMultipleOfAnotherNumber(int number, int anotherNumber) {
        if (number % anotherNumber == 0) {
            return true;
        } else {
            return false;
        }
    }
}
