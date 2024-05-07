package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.json;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonObjectKey;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.ObjectEqualityComparator;

public class JsonObjectKeyImpl implements JsonObjectKey {
	private final String name;
	public JsonObjectKeyImpl(String name) {
		this.name = name;
	}
	
	public String getKey() {
		return this.name;
	}
	public boolean nameIs(String string) {
		BooleanResult booleanResult = ObjectEqualityComparator.compareObjects(this.getKey(), string);
		if (booleanResult == BooleanResult.TRUE) {
			return true;
		} else if (booleanResult == BooleanResult.FALSE) {
			return false;
		} else {
			throw Constants.THE_OBJECTS_COULD_NOT_BE_COMPARED.apply(Language.DEFAULT).createException();
		}
	}
}