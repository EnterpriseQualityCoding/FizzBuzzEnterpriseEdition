package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SimpleExceptionType;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.ExceptionType;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Constants
 */
public class Constants {
	private Constants() {}

	private static final Object NULL_VALUE = null;
	@SuppressWarnings("unchecked")
	public static final <T> T NULL_VALUE() {
		return (T) Constants.NULL_VALUE;
	}

	private static final TranslationKey A_CONDITIONAL_LOOP_HAS_NO_CONTROL_PARAMETER_KEY = new TranslationKeyImpl("fizzbuzz.string.error.A_CONDITIONAL_LOOP_HAS_NO_CONTROL_PARAMETER");
	private static final TranslationKey A_CONDITIONAL_LOOP_HAS_NO_FINALIZATION_POINT_KEY = new TranslationKeyImpl("fizzbuzz.string.error.A_CONDITIONAL_LOOP_HAS_NO_FINALIZATION_POINT");
	private static final TranslationKey A_CONDITIONAL_LOOP_HAS_NO_INITIALIZATION_POINT_KEY = new TranslationKeyImpl("fizzbuzz.string.error.A_CONDITIONAL_LOOP_HAS_NO_INITIALIZATION_POINT");
	private static final TranslationKey AN_ATTEMPT_WAS_MADE_TO_DIVIDE_BY_ZERO_KEY = new TranslationKeyImpl("fizzbuzz.string.error.AN_ATTEMPT_WAS_MADE_TO_DIVIDE_BY_ZERO");
	private static final TranslationKey COULD_NOT_DETERMINE_IF_THE_LOOP_WAS_FINISHED_KEY = new TranslationKeyImpl("fizzbuzz.string.error.COULD_NOT_DETERMINE_IF_THE_LOOP_WAS_FINISHED");
	private static final TranslationKey KEY_NOT_FOUND_KEY = new TranslationKeyImpl("fizzbuzz.string.error.KEY_NOT_FOUND");
	private static final TranslationKey THE_INTEGERS_COULD_NOT_BE_COMPARED_KEY = new TranslationKeyImpl("fizzbuzz.string.error.THE_INTEGERS_COULD_NOT_BE_COMPARED");
	private static final TranslationKey THE_OBJECTS_COULD_NOT_BE_COMPARED_KEY = new TranslationKeyImpl("fizzbuzz.string.error.THE_OBJECTS_COULD_NOT_BE_COMPARED");
	private static final TranslationKey THE_WRONG_TYPE_OF_LOOP_STATE_WAS_PROVIDED_KEY = new TranslationKeyImpl("fizzbuzz.string.error.THE_WRONG_TYPE_OF_LOOP_STATE_WAS_PROVIDED");

	private static final TranslationKey FIZZ_KEY = new TranslationKeyImpl("fizzbuzz.string.output.FIZZ");
	private static final TranslationKey BUZZ_KEY = new TranslationKeyImpl("fizzbuzz.string.output.BUZZ");

	public static final Function<Language, ExceptionType> A_CONDITIONAL_LOOP_HAS_NO_CONTROL_PARAMETER = lang -> new SimpleExceptionType(lang.getStringForTranslationKey(A_CONDITIONAL_LOOP_HAS_NO_CONTROL_PARAMETER_KEY), UnsupportedOperationException::new);
	public static final Function<Language, ExceptionType> A_CONDITIONAL_LOOP_HAS_NO_FINALIZATION_POINT = lang -> new SimpleExceptionType(lang.getStringForTranslationKey(A_CONDITIONAL_LOOP_HAS_NO_FINALIZATION_POINT_KEY), UnsupportedOperationException::new);
	public static final Function<Language, ExceptionType> A_CONDITIONAL_LOOP_HAS_NO_INITIALIZATION_POINT = lang -> new SimpleExceptionType(lang.getStringForTranslationKey(A_CONDITIONAL_LOOP_HAS_NO_INITIALIZATION_POINT_KEY), UnsupportedOperationException::new);
	public static final Function<Language, ExceptionType> AN_ATTEMPT_WAS_MADE_TO_DIVIDE_BY_ZERO = lang -> new SimpleExceptionType(lang.getStringForTranslationKey(AN_ATTEMPT_WAS_MADE_TO_DIVIDE_BY_ZERO_KEY), ArithmeticException::new);
	public static final Function<Language, ExceptionType> COULD_NOT_DETERMINE_IF_THE_LOOP_WAS_FINISHED = lang -> new SimpleExceptionType(lang.getStringForTranslationKey(COULD_NOT_DETERMINE_IF_THE_LOOP_WAS_FINISHED_KEY), UnsupportedOperationException::new);
	public static final Function<Language, ExceptionType> KEY_NOT_FOUND = lang -> new SimpleExceptionType(lang.getStringForTranslationKey(KEY_NOT_FOUND_KEY), IllegalArgumentException::new);
	public static final Function<Language, ExceptionType> THE_INTEGERS_COULD_NOT_BE_COMPARED = lang -> new SimpleExceptionType(lang.getStringForTranslationKey(THE_INTEGERS_COULD_NOT_BE_COMPARED_KEY), UnsupportedOperationException::new);
	public static final Function<Language, ExceptionType> THE_OBJECTS_COULD_NOT_BE_COMPARED = lang -> new SimpleExceptionType(lang.getStringForTranslationKey(THE_OBJECTS_COULD_NOT_BE_COMPARED_KEY), UnsupportedOperationException::new);
	public static final Function<Language, ExceptionType> THE_WRONG_TYPE_OF_LOOP_STATE_WAS_PROVIDED = lang -> new SimpleExceptionType(lang.getStringForTranslationKey(THE_WRONG_TYPE_OF_LOOP_STATE_WAS_PROVIDED_KEY), IllegalArgumentException::new);
	
	public static final Function<Language, String> BUZZ = FunctionBindAdapter.bindSecond(Language::getStringForTranslationKey, BUZZ_KEY);
	public static final Function<Language, String> FIZZ = FunctionBindAdapter.bindSecond(Language::getStringForTranslationKey, FIZZ_KEY);

	public static final String ASSETS_VALUES_NUMBERS_PROPERTIES = "assets/values/numbers.properties";
	public static final String ASSETS_LANG = "assets/lang/";
	public static final String COM_SERIOUSCOMPANY_BUSINESS_JAVA_FIZZBUZZ_PACKAGENAMINGPACKAGE_IMPL_PRINTERS_INTEGER_INTEGER_PRINTER_PRINT = "com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.IntegerIntegerPrinter.print()";
	public static final String DEFAULT = "default";
	public static final String LINE_SEPARATOR = "line.separator";
	public static final String LOOP_COMPONENT_FACTORY = "loopComponentFactory";
	public static final String SPRING_XML = "spring.xml";
	public static final String STANDARD_FIZZ_BUZZ = "standardFizzBuzz";
	public static final String TRANSLATIONS = "translations";

	public static final int DEFAULT_FIZZ_BUZZ_UPPER_LIMIT_PARAMETER_VALUE;
	public static final int INTEGER_DIVIDE_ZERO_VALUE;
	public static final int INTEGER_ORIGIN_ZERO_VALUE;
	public static final int LOOP_INC_VALUE;
	public static final int LOOP_INIT_VALUE;

	static {
		InputStream inputStream = Constants.class.getClassLoader().getResourceAsStream(ASSETS_VALUES_NUMBERS_PROPERTIES);
		Properties properties = new Properties();
		properties.load(inputStream);
		DEFAULT_FIZZ_BUZZ_UPPER_LIMIT_PARAMETER_VALUE = Integer.parseInt(properties.get("default_fizz_buzz_upper_limit_parameter_value"));
		INTEGER_DIVIDE_ZERO_VALUE = Integer.parseInt(properties.get("integer_divide_zero_value"));
		INTEGER_ORIGIN_ZERO_VALUE = Integer.parseInt(properties.get("integer_origin_zero_value"));
		LOOP_INC_VALUE = Integer.parseInt(properties.get("loop_inc_value"));
		LOOP_INIT_VALUE = Integer.parseInt(properties.get("loop_init_value"));
	}
}
