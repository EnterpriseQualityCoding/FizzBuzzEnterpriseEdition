package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FileContentStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.ReaderToByteArrayInputStreamAdapter;

/**
 * Strategy for FileContentReader
 */
@Service
public class FileContentReaderStrategy implements FileContentStrategy {

	/**
	 * @param filename String
	 * @throws IOException
	 * @return InputStream
	 */
	@Override
	public InputStream getFileContents(String filename) throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(filename).getFile());
		FileReader fileReader = new FileReader(file);
		ReaderToByteArrayInputStreamAdapter readerToByteArrayInputStreamAdapter = new ReaderToByteArrayInputStreamAdapter(fileReader);
		InputStream inputStream = readerToByteArrayInputStreamAdapter.generateInputStream();
		return inputStream;
	}
}
