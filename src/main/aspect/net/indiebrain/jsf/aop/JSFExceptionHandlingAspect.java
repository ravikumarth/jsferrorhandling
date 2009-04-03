package net.indiebrain.jsf.aop;

import net.indiebrain.jsf.ErrorPage;
import net.indiebrain.jsf.SamplePage;
import net.indiebrain.util.FacesContextUtility;
import net.indiebrain.util.NavigationHandlerUtility;
import net.indiebrain.util.NavigationHandlerUtility.NavigationConstants;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * This class advises methods whcih JSF Backing beans expose to intercept
 * Exceptions before they are consumed in the JSF Lifecycle.
 * 
 * @author aaronk
 */
@Aspect
public class JSFExceptionHandlingAspect {

	/**
	 * Pointcut definition. For this example the adivce will be applied to all
	 * public methods in the {@link SamplePage} class.
	 */
	@Pointcut("execution(public * net.indiebrain.jsf..*(..))")
	public void uiAction() {

	}

	/**
	 * After throwing an exception, application joinpoints will execute this
	 * method; setting up the {@link ErrorPage} for display
	 * 
	 * @param joinPoint
	 * @param exception
	 */
	@AfterThrowing(pointcut = "uiAction()", throwing = "exception")
	public void navigationAdvice(JoinPoint joinPoint, Throwable exception) {

		ErrorPage errorPage = FacesContextUtility.getBean(ErrorPage.class);
		errorPage.setException(exception);
		NavigationHandlerUtility.navigate(NavigationConstants.Error
				.getOutcome());
	}
}
