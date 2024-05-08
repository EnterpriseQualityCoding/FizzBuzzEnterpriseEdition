package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.FileContentReaderStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FileContentStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FileContentStrategy;

/**
 * Factory for FileContentReaderStrategy
 */
@Service
public class FileContentReaderStrategyFactory implements FileContentStrategyFactory {
	private final FileContentReaderStrategy _fileContentReaderStrategy;

	/**
	 * @param _fileContentReaderStrategy BuzzStrategy
	 */
	@Autowired
	public FileContentReaderStrategyFactory(final FileContentReaderStrategy _fileContentReaderStrategy) {
		super();
		this._fileContentReaderStrategy = _fileContentReaderStrategy;
	}

	/**
	 * @return FileContentStrategy
	 */
	@Override
	public FileContentStrategy createFileContentStrategy() {
		return this._fileContentReaderStrategy;
	}
}
