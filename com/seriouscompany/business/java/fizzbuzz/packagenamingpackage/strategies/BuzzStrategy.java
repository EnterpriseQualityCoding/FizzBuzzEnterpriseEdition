package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.strategies;

public class BuzzStrategy implements IsEvenlyDivisibleStrategy {
	public boolean isEvenlyDivisible(int i) {
		if ((((int)(i / 5)) * 5 == i)) {
			return true;
		} else {
			return false;
		}
	}
}
