package com.bsq.struts2.test;

/**
 * 动作类 pojo (plain old java object)
 * 
 * @author chfs-bsq
 *
 */
public class HelloAction {

	public String hello() {
		System.out.println("调用了");
		return "Success";

		
	}
}
