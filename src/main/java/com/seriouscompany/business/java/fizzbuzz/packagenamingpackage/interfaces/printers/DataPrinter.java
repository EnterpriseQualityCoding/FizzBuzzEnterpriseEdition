package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers;

import javax.annotation.Nonnull;

public interface DataPrinter {
	public void print();
	public void printValue(@Nonnull Object value);
}

