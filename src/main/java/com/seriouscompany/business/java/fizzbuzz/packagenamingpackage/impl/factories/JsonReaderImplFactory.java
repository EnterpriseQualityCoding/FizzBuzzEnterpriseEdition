package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

/**
 * Factory for JsonReaderImpl
 */
@Service
public class JsonReaderImplFactory implements JsonReaderFactory {
	private final InputStream inputStream;
	
	public JsonReaderImplFactory(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	public JsonReader createJsonReader() {
		return new JsonReaderImpl(inputStream);
	}
}