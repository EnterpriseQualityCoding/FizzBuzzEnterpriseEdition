package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.json;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.StandardPipeline;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.Pipeline;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class JsonReaderImpl implements JsonReader {
	private static final JsonObjectHolderFactory jsonObjectHolderFactory = new JsonObjectHolderFactoryImpl();
    private final InputStream inputStream;
    public JsonReaderImpl(InputStream inputStream) {
        this.inputStream = inputStream
    }

    public JsonObjectHolder readJson() {
        final String systemDefaultNewLineString = System.getProperty(com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants.LINE_SEPARATOR);
        Pipeline<InputStream, String> inputStreamStringifier = StandardPipeline
            .of(is -> new InputStreamReader(is, StandardCharsets.UTF_8))
            .next(BufferedReader::new)
            .next(BufferedReader::lines)
            .next(l -> l.collect(Collectors.joining(systemDefaultNewLineString)));
        String text = inputStreamStringifier.run(this.inputStream);
		JsonTokener jsonTokener = new JsonTokener(text);
		JsonParserConfiguration jsonParserConfiguration = new JsonParserConfiguration();
		JsonObject jsonObject = new JsonObject(jsonTokener, jsonParserConfiguration);
		JsonObjectHolder jsonObjectHolder = this.jsonObjectHolderFactory.createJsonObjectHolder(jsonObject);
		return jsonObjectHolder;
    }
}