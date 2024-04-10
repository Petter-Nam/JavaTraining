<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String travel = request.getParameter("travel");
		String memo = request.getParameter("memo");
	%>
	
	<fieldset>
		<p><%=id %></p>
		<p><%=password %></p>
		<p><%=name %></p>
		<p><%=age %></p>
		<p><%=gender %></p>
		<%
			for (int i = 0; i < hobby.length; i++) {
		%>
			<p><%=hobby[i] %></p>
		<% 
			}
		%>
		<p><%=travel %></p>
		<p><%=memo %></p>
	
	</fieldset>
</body>
</html>