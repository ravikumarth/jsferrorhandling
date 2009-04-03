package net.indiebrain.util;

import javax.el.ELContext;
import javax.el.ELResolver;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;

/**
 * FacesContextUtility is a utility class that handles access to various aspects
 * of the faces context.
 */
public class FacesContextUtility {

	/**
	 * Gets an object from the facesContext based on the class name.
	 * 
	 * @param className
	 *            class name of the object to be found
	 * @return Object instance of the object searched for in the faces context
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz) {

		String beanName = clazz.getSimpleName();
		return (T) getBackingBean(beanName);
	}

	private static Object getBackingBean(String beanName) {

		return getElResolver().getValue(getElContext(), null, beanName);
	}

	private static ELResolver getElResolver() {

		return getApplication().getELResolver();
	}

	private static ELContext getElContext() {

		return FacesContext.getCurrentInstance().getELContext();
	}

	private static Application getApplication() {

		FacesContext facesContext = FacesContext.getCurrentInstance();
		return facesContext.getApplication();
	}

}
