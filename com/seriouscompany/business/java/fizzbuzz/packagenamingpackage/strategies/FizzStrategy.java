package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.strategies;

public class FizzStrategy implements IsEvenlyDivisibleStrategy {
	public boolean isEvenlyDivisible(int i) {
		if ((((int)(i / 3)) * 3 == i)) {
			return true;
		} else {
			return false;
		}
	}
}
