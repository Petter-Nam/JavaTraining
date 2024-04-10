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
		String pw = request.getParameter("pw");
		String dbId = request.getParameter("dbId");
		String dbPw = request.getParameter("dbPw");
		
		
		if (id.equals(dbId) && pw.equals(dbPw)) {
		%>
			<p>로그인되었습니다.</p>
		
		<% 
		}
		else {
		%>
			<p>다시확인하세요</p>
		<% 
		}
	%>
</body>
</html>