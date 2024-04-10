<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="javax.xml.crypto.Data"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>import</title>
</head>
<body>
	
	<%
	
		Random ran = new Random();
		String[] languages = {"java", "html", "CSS3", "javascript", "mySql", "jQuery"};
		
		int r = ran.nextInt(6);
	
	%>
	
	<h3><%=languages[r] %>언어가 재미있다.</h3>
	
	<%
		Date temp = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd:mm:ss");
		
		String time = sdf.format(temp);
	%>
		<p>현재시간 : <%=time %></p>
</body>
</html>