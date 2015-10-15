package com.bsq.struts2.form;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/*
 * 参数通过 action 本身来接受
 */
public class parametersAction extends ActionSupport implements ModelDriven<User> {

	///////////////// 方式1/////////////////////////////
	// private String userName="zhang";
	//
	// private String password="san";
	//
	// public String getUserName() {
	// return userName;
	// }
	//
	// public void setUserName(String userName) {
	// this.userName = userName;
	// }
	//
	// public String getPassword() {
	// return password;
	// }
	//
	// public void setPassword(String password) {
	// this.password = password;
	// }

	////////// 方式2/////////////////////////////////////////
	// private User user;
	//
	// public User getUser() {
	// return user;
	// }
	//
	// public void setUser(User user) {
	// this.user = user;
	// }

	/// 方式3///////////////////////////////

	private User user = new User();

	public String add() {
		// System.out.println("提交的参数" + userName + ":" + password);
		if (user != null) {
			System.out.println("请求的参数" + user.toString());
		}
		return SUCCESS;
	}

	//
	// @Override
	// public void validate() {
	// // TODO Auto-generated method stub
	// super.validate();
	//
	// if (StringUtils.isEmpty(user.getUserName())) {
	//
	// addFieldError(user.getUserName(), "用户名不能为空");
	// }
	//
	// }

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
