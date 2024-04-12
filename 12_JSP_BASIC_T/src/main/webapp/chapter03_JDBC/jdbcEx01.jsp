<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java DataBase Connectivity</title>
</head>
<body>

	<%-- 
	
		# JDBC (Java DataBase Connectivity) 데이터 베이스 연동 방법 
		
		1) (중요)mysql-connector-j-x.x.xx.jar파일을 WEB-INF 폴더의 lib 폴더에 넣는다. 
		
		2) Class.forName("com.mysql.cj.jdbc.Driver"); 및 연결정보를 작성한다.(url , id , password)
		
		3) DriverManager의 getConnection(url , id , password) 메소드를 사용하여
		   데이터베이스 연결정보가 저장되어있는 Connection 객체를 생성한다.
		
	--%>
	<%
		// 데이터베이스를 연결하기 위한 객체
		
		Connection conn = null; //java.sql.Connection
		try {
		
		//연결 드라이버 생성 forName
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//데이터 베이스 연결
		
		//데이터베이스 계정
		String url = "jdbc:mysql://localhost:3306/JDBC_EX?serverTimezone=Asia/Seoul";
		//데이터베이스 유저계정
		String user = "root";
		//데이터베이스 패스워드
		String password = "Jairo@@7414";
		
		conn = DriverManager.getConnection(url, user, password); // java.sql.DriverManager
		System.out.println("연결에 성공하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결에 실패하였습니다.");
		} finally {
			conn.close();//연결 종료
			
		}
		
	%>
	
</body>
</html>