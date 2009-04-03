package net.indiebrain.util;

/**
 * Utility to interact with String objects
 * 
 * @author aaronk
 */
public class StringUtility {

	// Object should never be instantiated.
	private StringUtility() {

	}

	/**
	 * Utility method to check the internal state of a {@link String} object
	 * 
	 * @param string
	 * @return True if the input string is null or the empty string.
	 */
	public static boolean isNullOrEmpty(String string) {

		return string == null || string.length() < 1;
	}
}
