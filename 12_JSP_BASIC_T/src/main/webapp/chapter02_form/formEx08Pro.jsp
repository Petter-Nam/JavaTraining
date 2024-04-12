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
		String yourAccount = request.getParameter("yourAccount"); 
		int yourMoney      = Integer.parseInt(request.getParameter("yourMoney"));
	
		String myAccount = request.getParameter("myAccount"); 
		int myMoney      = Integer.parseInt(request.getParameter("myMoney"));
	
		String sendAccount = request.getParameter("sendAccount"); 
		int sendMoney 	   = Integer.parseInt(request.getParameter("sendMoney"));
	
		String result = "";
		if (yourAccount.equals(sendAccount)) {
			if (sendMoney <= myMoney) {
				myMoney = myMoney - sendMoney;
				result = yourAccount + "계좌에 " + sendMoney +"원을 이체를 완료하였습니다. 남아있는 금액은 " + myMoney + "원 입니다";
			} 
			else {
				result = myAccount + "계좌에 잔액이 " + (sendMoney - myMoney) + "만큼  부족합니다.";
			}
		}
		else {
			result = "없는 계좌 입니다.";
		}
	%>
	<p><%=result %></p>
</body>
</html>