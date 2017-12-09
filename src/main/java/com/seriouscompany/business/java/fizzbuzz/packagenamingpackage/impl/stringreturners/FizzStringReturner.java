package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.language.LanguageStringService;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;
import org.springframework.stereotype.Service;

import static com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.enums.LanguageString.FIZZ;

@Service
public class FizzStringReturner implements StringStringReturner {

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder(LanguageStringService.getString(FIZZ));
		final String myString = myStringBuilder.toString();
		final char[] myCharacters = myString.toCharArray();
		return new String(myCharacters, 0, myCharacters.length);
	}

}
