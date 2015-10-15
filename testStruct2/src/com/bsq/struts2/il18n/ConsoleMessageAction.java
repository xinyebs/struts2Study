package com.bsq.struts2.il18n;

import com.opensymphony.xwork2.ActionSupport;

public class ConsoleMessageAction extends ActionSupport {
	
	public String showMsg() {
		String message = getText("hello");
		System.out.println(message);
		return SUCCESS;
	}
}
