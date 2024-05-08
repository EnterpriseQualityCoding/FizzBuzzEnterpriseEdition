package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FileContentStrategy;

/**
 * Factory for FileContentStrategy
 */
@Service
public interface FileContentStrategyFactory {
	/**
	 * @return FileContentStrategy
	 */
	public FileContentStrategy createFileContentStrategy() {
		return this._fileContentReaderStrategy;
	}
}
