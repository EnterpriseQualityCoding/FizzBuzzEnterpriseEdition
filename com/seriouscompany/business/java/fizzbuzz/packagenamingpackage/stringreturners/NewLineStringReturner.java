package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.stringreturners;

public class NewLineStringReturner {
	
	public String getNewLineString() {
		StringBuilder sb = new StringBuilder("\n");
		String s = sb.toString();
		return new String(s);
	}
}
