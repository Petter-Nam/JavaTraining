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
		String com = request.getParameter("com");
		String me = request.getParameter("me");
		String result = "";
		if (com.equals(me)) 		result = "비겼다.";
		else if (me.equals("가위")) result = "내가 졌다.";
		else if (me.equals("보")) 	result = "내가 이겼다.";
		else 						result = "잘못된 입력값 입니다. 가위 혹은 바위 혹은 보를 입력해주세요.";
		
		if (result.equals("내가 이겼다.")) {
		%>
			<p>이겼다.</p>
		<% 
		}
		else if (result.equals("내가 졌다")){
		%>
			<p>내가 졌다.</p>
		<% 
		}
		else {
		%>
			<p>비겼다.</p>
		<%	
		}
	%>
	 
</body>
</html>