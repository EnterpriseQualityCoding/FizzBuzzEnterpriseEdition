package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.language.LanguageStringService;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;
import org.springframework.stereotype.Service;

import static com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.enums.LanguageString.BUZZ;

@Service
public class BuzzStringReturner implements StringStringReturner {

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder(LanguageStringService.getString(BUZZ));
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
