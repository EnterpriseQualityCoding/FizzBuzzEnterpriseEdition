package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import java.util.function.Function;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.ExceptionType;

/**
 * SimpleExceptionType
 */
@Service
public class SimpleExceptionType implements ExceptionType {

	private final String message;
    private final Function<String, Exception> exceptionGenerator;

	/**
	 * @param message String
     * @param exceptionGenerator Function<String, ? extends Exception>
	 */
	public SimpleExceptionType(final String message, Function<String, ? extends Exception> exceptionGenerator) {
		super();
		this.message = message;
        this.exceptionGenerator = exceptionGenerator;
	}

	/**
	 * @return Exception
	 */
	@Override
	public Exception createException() {
		return this.exceptionGenerator.apply(this.message);
	}
}
