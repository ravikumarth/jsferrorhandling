package net.indiebrain.util;

import javax.faces.application.Application;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;

/**
 * Utility which provides simple a simpler API for dealing with programmatic JSF
 * Navigation events.
 * 
 * @author aaronk
 */
public class NavigationHandlerUtility {

	/**
	 * Enumeration which holds the acceptable Navigation outcome cases.
	 * 
	 * @author aaronk
	 */
	public enum NavigationConstants {

		Error("Error");

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

	/**
	 * Cues a navigation event to the view represented by the input outcome
	 * string. Mappings between outcomes and views can be found in the
	 * navigation.xml configuration
	 * 
	 * @param outcome
	 */
	public static final void navigate(String outcome) {

		Application application = FacesContext.getCurrentInstance()
				.getApplication();
		NavigationHandler navigationHandler = application
				.getNavigationHandler();
		navigationHandler.handleNavigation(FacesContext.getCurrentInstance(),
				"", outcome);
	}
}
