package net.indiebrain.service;

import net.indiebrain.jsf.SamplePage;
import net.indiebrain.jsf.exception.SampleException;
import net.indiebrain.util.StringUtility;

/**
 * Sample Service object used to process model data from the {@link SamplePage}.
 * In this sample application, the Service object can be considered the
 * Controller used to process Model data as the result of some View operation.
 * In this particular case, the BackingBean delegates to the Service to process
 * user actions.
 * 
 * Note that the SampleService and SamplePage, in this example are tightly
 * coupled. In real code you would want to decouple these two objects through
 * use of interfaces.
 * 
 * @author aaronk
 * 
 */
public class SampleService {

	/**
	 * Processes the UI Model on a Submit Action
	 * 
	 * @param samplePage
	 */
	public static void processSubmitAction(SamplePage samplePage) {

		if (StringUtility.isNullOrEmpty(samplePage.getSampleInputText())) {

			// NOTE: This will most likely be consumed by JSF if we don't do
			// anything about it
			throw new SampleException("Invalid input: "
					+ samplePage.getSampleInputText());
		}
	}
}
