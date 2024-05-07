package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzExceptionSafeOutputStrategy;
import java.io.InputStream;

/**
 * Adapter for ReaderToByteInputStream
 */
public final class ReaderToByteArrayInputStreamAdapter implements InputStreamGenerationStrategy {
    private final Reader _reader;

	/**
	 * @param reader Reader
	 */
	public ReaderToByteArrayInputStreamAdapter(final Reader reader) {
		this._reader = reader;
	}

	/**
	 * @return InputStream
	 */
	@Override
	public InputStream generateInputStream() throws IOException {
		Reader reader = this._reader;

		char[] charBuffer = new char[8 * 1024];
		StringBuilder builder = new StringBuilder();
		int numCharsRead;
		
		while ((numCharsRead = reader.read(charBuffer, 0, charBuffer.length)) != -1) {
			builder.append(charBuffer, 0, numCharsRead);
		}
		InputStream inputStream = new ByteArrayInputStream(builder.toString().getBytes(StandardCharsets.UTF_8));

		reader.close();
		return inputStream;
	}
}
