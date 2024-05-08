package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.visitors;

import org.json.JsonObject;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.json.JsonObjectAccessor;

public interface JsonObjectVisitor {
    JsonVisitorResult visit(JsonObjectAccessor jsonObjectAccessor);
}