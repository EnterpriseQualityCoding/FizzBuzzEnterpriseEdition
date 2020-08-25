package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors.FizzBuzzOutputGenerationContextVisitor;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.OutputGenerationContextVisitorFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

/**
 * Factory for FizzBuzzOutputGenerationContextVisitor
 */
@Service
public class FizzBuzzOutputGenerationContextVisitorFactory implements
		OutputGenerationContextVisitorFactory {

	private final FizzBuzzOutputGenerationContextVisitor _fizzBuzzOutputGenerationContextVisitor;

	/**
	 * @param _fizzBuzzOutputGenerationContextVisitor FizzBuzzOutputGenerationContextVisitor
	 */
	@Autowired
	public FizzBuzzOutputGenerationContextVisitorFactory(
			final FizzBuzzOutputGenerationContextVisitor _fizzBuzzOutputGenerationContextVisitor) {
		super();
		this._fizzBuzzOutputGenerationContextVisitor = _fizzBuzzOutputGenerationContextVisitor;
	}

	/**
	 * @return OutputGenerationContextVisitor
	 */
	@Override
	public OutputGenerationContextVisitor createVisitor() {
		return this._fizzBuzzOutputGenerationContextVisitor;
	}

}
