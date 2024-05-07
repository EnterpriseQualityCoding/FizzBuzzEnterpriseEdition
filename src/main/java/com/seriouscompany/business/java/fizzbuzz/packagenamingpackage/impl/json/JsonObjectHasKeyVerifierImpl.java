package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.data.BooleanResult;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.stream.StandardPipeline;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonObjectHasKeyVerifier;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.Pipeline;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JsonObject;

public class JsonObjectHasKeyVerifierImpl implements JsonObjectHasKeyVerifier {
    private final JsonObject jsonObject;
	private final JsonObjectKey jsonObjectKey;
    
	public JsonObjectHasKeyVerifierImpl(JsonObject jsonObject, JsonObjectKey jsonObjectKey) {
		this.jsonObject = jsonObject;
		this.jsonObjectKey = jsonObjectKey;
	}

    public BooleanResult verifyJsonObjectHasKey() {
        Pipeline<JsonObject, BooleanResult> jsonObjectHasKeyPipeline = StandardPipeline
            .of(JsonObject::entrySet)
            .next(Set::stream)
            .next(FunctionBindAdapter.bindSecond(Stream::map, Entry::getKey))
            .next(FunctionBindAdapter.bindSecond(BooleanResult.from(Stream::anyMatch), JsonObjectKey::nameIs));
        BooleanResult booleanResult = jsonObjectHasKeyPipeline.run(this.jsonObjectKey);
        return booleanResult;
    }
}