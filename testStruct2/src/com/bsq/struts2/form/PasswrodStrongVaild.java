package com.bsq.struts2.form;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class PasswrodStrongVaild extends FieldValidatorSupport {

	private int minLength = -1;

	public int getMinLength() {
		return minLength;
	}

	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}
	// 验证方法：针对不符合要求的内容进行判断，向Map中添加信息即可
	// 参数：object就是当前的动作对象

	@Override
	public void validate(Object object) throws ValidationException {
		// TODO Auto-generated method stub

		// 获取要验证的字段名称
		String fieldName = getFieldName();
		Object fieldValue = getFieldValue(fieldName, object);
		if (fieldValue == null)
			return;
		if (!isStrong((String) fieldValue)) {
			addFieldError(fieldName, object);
		}
		if ((minLength > -1) && ((String) fieldValue).length() < minLength) {
			// 添加一个消息
			addFieldError(fieldName, object);
		}
	}

	// 判断s是否强大
	private static final String GROUP1 = "abcdefghijklmnopqrstuvwxyz";
	private static final String GROUP2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String GROUP3 = "0123456789";

	// 判断密码是否强壮：至少一个大写字母、一个小写字母、一个数字
	private boolean isStrong(String s) {
		boolean ok1 = false;
		boolean ok2 = false;
		boolean ok3 = false;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			if (ok1 && ok2 && ok3)
				break;
			String character = s.substring(i, i + 1);
			if (GROUP1.contains(character)) {
				ok1 = true;
				continue;
			}
			if (GROUP2.contains(character)) {
				ok2 = true;
				continue;
			}
			if (GROUP3.contains(character)) {
				ok3 = true;
				continue;
			}
		}
		return ok1 && ok2 && ok3;
	}

}
