package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.visitors.FizzBuzzOutputGenerationContextVisitor;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.OutputGenerationContextVisitorFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors.OutputGenerationContextVisitor;

@Service
public class FizzBuzzOutputGenerationContextVisitorFactory implements
		OutputGenerationContextVisitorFactory {

	@Autowired
	private FizzBuzzOutputGenerationContextVisitor _fizzBuzzOutputGenerationContextVisitor;
	
	@Override
	public OutputGenerationContextVisitor createVisitor() {
		return _fizzBuzzOutputGenerationContextVisitor;
	}

}
