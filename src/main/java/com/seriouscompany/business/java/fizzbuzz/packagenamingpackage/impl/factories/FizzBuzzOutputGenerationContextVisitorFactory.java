package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors.FizzBuzzOutputGenerationContextVisitor;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.OutputGenerationContextVisitorFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

import javax.annotation.Nonnull;

@Service
public class FizzBuzzOutputGenerationContextVisitorFactory implements
		OutputGenerationContextVisitorFactory {

	@Nonnull
	private final FizzBuzzOutputGenerationContextVisitor _fizzBuzzOutputGenerationContextVisitor;

	@Autowired
	public FizzBuzzOutputGenerationContextVisitorFactory(
			@Nonnull final FizzBuzzOutputGenerationContextVisitor _fizzBuzzOutputGenerationContextVisitor) {
		this._fizzBuzzOutputGenerationContextVisitor = _fizzBuzzOutputGenerationContextVisitor;
	}

	@Nonnull
	@Override
	public OutputGenerationContextVisitor createVisitor() {
		return this._fizzBuzzOutputGenerationContextVisitor;
	}

}
