<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		[문제설명] <br><br>
		
		1. 2021 ~ 1900 까지 년도에 표기
		2. 1 ~ 12까지 월에 표기
		3. 1 ~ 31까지 일에 표기
	
	</p>
	
	<select>
	<%
	
			for (int i = 2021; i >= 1900; i--) {
	%>
				<option value=<%=i %>><%=i %></option>
	<% 
			}
	
	%>
	</select>
	<select>
	
		<%
			for (int i = 12; i >= 1; i--) {
		%>
				<option value=<%=i %>><%=i %></option>
		<% 
			}
		%>
	
	
	</select>
	<select>
	
		<%
			for (int i = 31; i >= 1; i--) {
		%>
				<option value=<%=i %>><%=i %></option>
		<% 
			}
		%>
	
	
	</select>
	

</body>
</html>