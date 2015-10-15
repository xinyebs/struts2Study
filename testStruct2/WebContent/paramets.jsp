<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表单参数</title>
</head>
<body>

	<s:fielderror></s:fielderror>
	<form
		action="${pageContext.request.contextPath}/fromparameters/parametersAction.action"
		method="post">

		用户名称：<input type="text" name="userName"><br /> 密码：<input
			type="text" name="password"><br /> 时间：<input type="text"
			name="regDate"><br /> 兴趣爱好： <Br /> <input name="hobby"
			type="checkbox" value="打篮球">打篮球 <Br /> <input name="hobby"
			type="checkbox" value="乒乓球">乒乓球 <Br /> <input name="hobby"
			type="checkbox" value="羽毛球">羽毛球 <br /> <input type="text"
			name="schools[0].key" value="小学" /> <input type="text"
			name="schools[0].value" value="希望小学" /> <br /> <input type="text"
			name="schools[1].key" value="中学" /> <input type="text"
			name="schools[1].value" value="希望中学" /> <br /> <input type="text"
			name="schools[2].key" value="大学" /> <input type="text"
			name="schools[2].value" value="希望大学" /> <input type="submit"
			value="提交"><br />
	</form>
</body>
</html>