package net.indiebrain.jsf;

import javax.faces.event.ActionEvent;

import net.indiebrain.service.SampleService;

/**
 * Backing bean for the Sample.jspx view. In this sample application, the Page
 * object can be considered the Model where the View stores its user data.
 * 
 * @author aaronk
 */
public class SamplePage {

	private String sampleInputText;

	/**
	 * Processes a submit action from the View.
	 */
	public void processSubmitAction(ActionEvent actionEvent) {

		SampleService.processSubmitAction(this);
	}

	/**
	 * @return the sampleInputText
	 */
	public String getSampleInputText() {

		return sampleInputText;
	}

	/**
	 * @param sampleInputText
	 *            the sampleInputText to set
	 */
	public void setSampleInputText(String sampleInputText) {

		this.sampleInputText = sampleInputText;
	}
}
