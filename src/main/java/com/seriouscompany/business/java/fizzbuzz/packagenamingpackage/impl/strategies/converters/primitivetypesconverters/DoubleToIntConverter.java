package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.converters.primitivetypesconverters;

import org.springframework.stereotype.Service;

@Service
public final class DoubleToIntConverter {

	private DoubleToIntConverter() {}

	public static int Convert(final double dbDoubleToConvert) {
		final int nConversionResult = (int) dbDoubleToConvert;
		return nConversionResult;
	}

}
