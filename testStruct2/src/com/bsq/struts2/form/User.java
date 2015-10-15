package com.bsq.struts2.form;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

public class User implements Serializable {

	private String userName;

	private String password;
	// 默认是yyyy-MM-dd 格式，如果要MM/dd/yyyy需要自定义类型转换器
	private Date regDate;

	// 数组
	private String[] hobby;

	// 集合
	private Collection<School> schools;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public Collection<School> getSchools() {
		return schools;
	}

	public void setSchools(Collection<School> schools) {
		this.schools = schools;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", regDate=" + regDate + ", hobby="
				+ Arrays.toString(hobby) + ", schools=" + schools + "]";
	}

}
