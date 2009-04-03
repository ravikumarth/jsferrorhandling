package net.indiebrain.util;

/**
 * Enumeration which holds the acceptable Navigation outcome cases.
 * 
 * @author aaronk
 */
public enum NavigationConstants {

	Error("Error"), SampleResponse("SampleResponse");

	private String outcome;

	private NavigationConstants(String outcome) {

		this.outcome = outcome;
	}

	/**
	 * @return the outcome
	 */
	public String getOutcome() {

		return outcome;
	}
}
