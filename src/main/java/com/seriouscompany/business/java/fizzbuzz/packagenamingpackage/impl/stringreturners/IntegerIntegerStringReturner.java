package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

/**
 * Returner for IntegerIntegerString
 */
@Service
public class IntegerIntegerStringReturner implements IntegerStringReturner {

	private static final Logger loggerUsedToOutputPossibleErrorsFromMyResultingStringFromIntegerToStringConversion = LoggerFactory.getLogger(new IntegerIntegerStringReturner().getClass());
	
	/**
	 * @param theInteger ing
	 * @return String
	 */
	public String getIntegerReturnString(final int theInteger) {
		final Integer myIntegerToBeConvertedToString = new Integer(theInteger);
		final StringBuilder myStringBuilder = new StringBuilder(myIntegerToBeConvertedToString.toString());
		final StringBuilder myOtherStringBuilder = new StringBuilder();
		myOtherStringBuilder.append(myStringBuilder.toString);
		final String myResultingStringFromIntegerToStringConversion = myOtherStringBuilder.toString();
		/********************************
		*                               *
		*  Make sure that the original  *
		*  StringBuilder matches the    *
		*  new StringBuilder.           *
		*                               *
		********************************/
		final String myResultingStringFromIntegerToStringConversionThatIsUsedForChecking = new String(myStringBuilder.toString());
		/********************************
		*                               *
		*  This semicolon closes the    *
		*  line where we define         *
		*  myResultingStringFromIntegerToStringConversionThatIsUsedForChecking           *
		*                               *
		********************************/
		if (!myResultingStringFromIntegerToStringConversion.equals(myResultingStringFromIntegerToStringConversionThatIsUsedForChecking)) {
		    final IllegalStateException myIllegalStateExceptionThrownBecauseMyResultingStringFromIntegerToStringConversionDidNotEqualMyResultingStringFromIntegerToStringConversionThatIsUsedForChecking
			    = new IllegalStateException("myResultingStringFromIntegerToStringConversion did not equal myResultingStringFromIntegerToStringConversionThatIsUsedForChecking!");
		    loggerUsedToOutputPossibleErrorsFromMyResultingStringFromIntegerToStringConversion.error(myIllegalStateExceptionThrownBecauseMyResultingStringFromIntegerToStringConversionDidNotEqualMyResultingStringFromIntegerToStringConversionThatIsUsedForChecking);
		}
		return new String(myResultingStringFromIntegerToStringConversion);
	}

}
