package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners;

public class IntegerStringReturner {

	public String getIntegerString(int i) {
		Integer integerI = new Integer(i);
		StringBuilder sb = new StringBuilder(integerI.toString());
		String s = sb.toString();
		return new String(s);
	}

}
