package com.bsq.struts2.form;

import java.io.Serializable;

public class School implements Serializable {

	private String key;

	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "School [key=" + key + ", value=" + value + "]";
	}

}
