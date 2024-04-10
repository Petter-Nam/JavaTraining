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
 		String name = request.getParameter("name");
 		String contact = request.getParameter("contact");
 		String email = request.getParameter("email");
 		String modelName = request.getParameter("modelName");
 		String quantity = request.getParameter("quantity");
 		
 		
 		String agreeSafeCare = request.getParameter("agreeSafeCare");
 		String requestInfo = request.getParameter("requestInfo");
 		String agreePrivateInform = request.getParameter("agreePrivateInform");
 		
 		
 	
 	
 	%>
 	
 	<fieldset>
 		<p><%=name %></p>
 		<p><%=contact %></p>
 		<p><%=email %></p>
 		<p><%=modelName %></p>
 		<p><%=quantity %></p>
 		<p><%=agreeSafeCare %></p>
 		<p><%=requestInfo %></p>
 		<p><%=agreePrivateInform %></p>
 	
 	
 	</fieldset>

</body>
</html>