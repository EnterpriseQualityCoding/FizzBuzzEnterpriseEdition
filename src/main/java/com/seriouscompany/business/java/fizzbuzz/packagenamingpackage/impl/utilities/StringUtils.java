package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.utilities;

/**
 * This class provides common String manipulation utilities
 */
public class StringUtils {

    /**
     * Returns value if value is not null or empty, otherwise returns defaultValue.
     * @param value - the string to check for null / empty
     * @param defaultValue - the default value to return.  It is the caller's responsibility to ensure this is non-null
     * @return - value if value is not null or empty, otherwise defaultValue
     */
    public static String safeString(String value, String defaultValue) {
        if (isEmptyOrNull(value)) {
            return defaultValue;
        }
        else {
            return value;
        }
    }

    /**
     * Returns true if the specified parameter is empty or null, otherwise false
     * @param value - the string to check for null / empty
     * @return - true if the specified parameter is empty or null, otherwise false
     */
    private static boolean isEmptyOrNull(String value) {
        if (value == null) {
            return true;
        }
        else if (value.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
