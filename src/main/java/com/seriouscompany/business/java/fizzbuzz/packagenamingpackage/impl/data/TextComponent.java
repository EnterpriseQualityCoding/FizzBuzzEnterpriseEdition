package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.data;

public class TextComponent implements Component {
	private String text;

	public TextComponent(String text) {
		this.text = text;
	}

	public String resolve() {
		return text;
	}
}