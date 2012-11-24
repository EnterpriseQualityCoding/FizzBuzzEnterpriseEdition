package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.strategies;

public class NoFizzNoBuzzStrategy implements IsEvenlyDivisibleStrategy {

	public boolean isEvenlyDivisible(int i) {
		if ((((int)(i / 3)) * 3 != i)) {
			if ((((int)(i / 5)) * 5 != i)) {
				return true;
			} else {
				return false;
			}
		} else if ((((int)(i / 5)) * 5 != i)) {
			if ((((int)(i / 3)) * 3 != i)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
}
