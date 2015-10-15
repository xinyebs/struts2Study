<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a
		href="${pageContext.request.contextPath}/customer/add_customer.action">添加</a>

	<a
		href="${pageContext.request.contextPath}/customer/edit_customer.action">编辑</a>

	<a
		href="${pageContext.request.contextPath}/customer/delete_customer.action">删除</a>

	<Br />

	<a href="${pageContext.request.contextPath}/viewType/chain.action">测试
		chain</a>
	<br />
	
	
	<a href="${pageContext.request.contextPath}/Vaildcode.jsp">测试验证随机码</a>
	
	<br>

</body>
</html>