package net.indiebrain.jsf;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Backing bean for the Error.jspx view
 * 
 * @author aaronk
 */
public class ErrorPage {

	private Throwable exception;
	private String exceptionStack;

	/**
	 * @return the exceptionStack
	 */
	public String getExceptionStack() {

		buildExceptionStack();
		return exceptionStack;
	}

	private void buildExceptionStack() {

		if (exception == null) {
			exceptionStack = "Exception message is empty... Sorry.";
		} else {
			StringWriter stringWriter = new StringWriter();
			PrintWriter printWriter = new PrintWriter(stringWriter);
			exception.printStackTrace(printWriter);
			exceptionStack = stringWriter.toString();
		}
	}

	/**
	 * @param exceptionStack
	 *            the exceptionStack to set
	 */
	public void setExceptionStack(String exceptionStack) {

		this.exceptionStack = exceptionStack;
	}

	/**
	 * @param exception
	 *            the exception to set
	 */
	public void setException(Throwable exception) {

		this.exception = exception;
	}
}
