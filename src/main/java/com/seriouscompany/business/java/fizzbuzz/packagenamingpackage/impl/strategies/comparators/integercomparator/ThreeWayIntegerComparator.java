package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.language.LanguageStringService;
import org.springframework.stereotype.Service;

import static com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.enums.LanguageString.THE_INTEGERS_COULD_NOT_BE_COMPARED;

@Service
public final class ThreeWayIntegerComparator {

	public static ThreeWayIntegerComparisonResult compare(final int nFirstInteger, final int nSecondInteger) {
		if (nFirstInteger == nSecondInteger) {
			return ThreeWayIntegerComparisonResult.FirstEqualsSecond;
		} else if (nFirstInteger < nSecondInteger) {
			return ThreeWayIntegerComparisonResult.FirstIsLessThanSecond;
		} else if (nFirstInteger > nSecondInteger) {
			return ThreeWayIntegerComparisonResult.FirstIsGreaterThanSecond;
		} else {
			// If the integers cannot be compared, then something is seriously wrong with the numbers.
			throw new UnsupportedOperationException(LanguageStringService.getString(THE_INTEGERS_COULD_NOT_BE_COMPARED));
		}
	}

}
