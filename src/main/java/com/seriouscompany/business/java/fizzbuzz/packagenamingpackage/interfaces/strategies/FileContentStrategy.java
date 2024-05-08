package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies;

import java.io.IOException;
import java.io.InputStream;

public interface FileContentStrategy {
	/**
	 * @param filename String
	 * @throws IOException
	 * @return InputStream
	 */
    public InputStream getFileContents(String filename) throws IOException;
}
