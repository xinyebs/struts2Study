package com.bsq.struts2.form;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/*
 * ����ͨ�� action ����������
 */
public class parametersAction extends ActionSupport implements ModelDriven<User> {

	///////////////// ��ʽ1/////////////////////////////
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

	////////// ��ʽ2/////////////////////////////////////////
	// private User user;
	//
	// public User getUser() {
	// return user;
	// }
	//
	// public void setUser(User user) {
	// this.user = user;
	// }

	/// ��ʽ3///////////////////////////////

	private User user = new User();

	public String add() {
		// System.out.println("�ύ�Ĳ���" + userName + ":" + password);
		if (user != null) {
			System.out.println("����Ĳ���" + user.toString());
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
	// addFieldError(user.getUserName(), "�û�������Ϊ��");
	// }
	//
	// }

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
