package com.chainsys.miniproject.commonutil;

public class ExceptionManager {
	public static String handleException(Exception err,String source,String message) {
		LogManager.logException(err,source);
		message+="Message: "+err.getMessage();
		String errorPage=HTMLHelper.getHTMLTemplate("ERROR", message);
		return errorPage;
	}
}
