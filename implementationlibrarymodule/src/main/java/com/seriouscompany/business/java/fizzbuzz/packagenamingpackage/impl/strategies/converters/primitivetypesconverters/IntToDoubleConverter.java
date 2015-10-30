package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.converters.primitivetypesconverters;

import org.springframework.stereotype.Service;

@Service
public class IntToDoubleConverter {

	public static double Convert(final int nIntegerToConvert) {
		final double dbConversionResult = (double) nIntegerToConvert;
		return dbConversionResult;
	}
}
