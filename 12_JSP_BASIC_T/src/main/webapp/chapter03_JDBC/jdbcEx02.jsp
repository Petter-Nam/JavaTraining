<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select 예시</title>
</head>
<body>
	
	<%
		
		// 데이터베이스를 연결하기 위한 객체
		Connection conn = null; // java.sql.Connection
		
		// 쿼리문을 실행하기 위한 객체
		PreparedStatement pstmt = null; // java.sql.PreparedStatement
	
		// select쿼리의 결과를 저장할 객체
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_EX?serverTimezone=Asia/Seoul" , "root" , "Jairo@@7414");
			
			/*
			
				# prepareStatement
				
				- 원래 statement객체로 사용하였으나 SQL Injection 공격에 대응하는 보안 기법으로 prepareStatement를 사용한다.
				
				- 우선 ?로 쿼리문의 파라메타 형식을 만들고 setter 메서드로 데이터를 대입하여 쿼리문을 완성한다.
				   pstmt.set자료형(인덱스, 값);
				
				- 인덱스는 1부터 시작한다.
				
				Ex)
				pstmt.setInt(index , value);     // 정수 타입 데이터 적용 메서드
				pstmt.setString(index , value);  // 문자열 타입 데이터 적용 메서드
				pstmt.setDate(index , value);  	 // 날짜 타입 데이터 적용 메서드
			
			*/
			
			// 선처리문 쿼리 작성
			pstmt = conn.prepareStatement("SELECT * FROM PRODUCT");
			
			// executeQuery(); : select문 실행 메서드
			rs = pstmt.executeQuery();
			
			/*
			
				# db의 컬럼명을 가져 오는 2가지 방법
				
					1) rs.get자료형메서드("컬럼명");
					  
						ex) 
							rs.getString("PRODUCT_CD"); 
							rs.getInt("PRODUCT_PRICE");
							rs.getDate("ENROLL_DT");
					
							
					2) rs.get자료형메서드(index);
						
						ex) 
							rs.getString(1);
							rs.getInt(2);
							rs.getDate(3);
					
						- 유지보수 및 가독성 향상을 위해서 컬럼명지정 방식을 권장한다.
						- index가 1부터 시작되는 점을 유의해야 한다.
				
			*/
			
			while (rs.next()) { // rs.next() : 다음결과물이 있으면 true를 반환한다.
				
				String productCd = rs.getString("PRODUCT_CD"); // rs.getString(1);
				String productNm = rs.getString("PRODUCT_NM"); // rs.getString(2);
				int price = rs.getInt("PRICE");				   // rs.getInt(3);
				Date regDt = rs.getDate("REG_DT");			   // rs.getDate(4);
				
				System.out.println("productCd : " + productCd);
				System.out.println("productNm : " + productNm);
				System.out.println("price : " + price);
				System.out.println("date : " + regDt);
				System.out.println();
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 데이터베이스 연결정보 해지
			rs.close();
			pstmt.close();
			conn.close();
		}
		
	%>

</body>
</html>