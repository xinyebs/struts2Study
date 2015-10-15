package com.bsq.struts2.convert;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * 日期转换器
 * @author chfs-bsq
 */
public class DateTypeConvert extends StrutsTypeConverter {
	
	private DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	//从字符串转date
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) 
	{

		if (toClass == java.util.Date.class) {

			String value = values[0];

			try {
				
				return format.parse(value);

			} catch (Exception ex) {

				ex.printStackTrace();
			}

		}
		return null;
	}

	//从日期转string
	@Override
	public String convertToString(Map context, Object o) {
		
		if (o instanceof java.util.Date) {

			java.util.Date  data=(java.util.Date)o;
			
			return  format.format(data);
		}
		return null;
	}

}
