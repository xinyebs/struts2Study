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
	// ��֤��������Բ�����Ҫ������ݽ����жϣ���Map�������Ϣ����
	// ������object���ǵ�ǰ�Ķ�������

	@Override
	public void validate(Object object) throws ValidationException {
		// TODO Auto-generated method stub

		// ��ȡҪ��֤���ֶ�����
		String fieldName = getFieldName();
		Object fieldValue = getFieldValue(fieldName, object);
		if (fieldValue == null)
			return;
		if (!isStrong((String) fieldValue)) {
			addFieldError(fieldName, object);
		}
		if ((minLength > -1) && ((String) fieldValue).length() < minLength) {
			// ���һ����Ϣ
			addFieldError(fieldName, object);
		}
	}

	// �ж�s�Ƿ�ǿ��
	private static final String GROUP1 = "abcdefghijklmnopqrstuvwxyz";
	private static final String GROUP2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String GROUP3 = "0123456789";

	// �ж������Ƿ�ǿ׳������һ����д��ĸ��һ��Сд��ĸ��һ������
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
