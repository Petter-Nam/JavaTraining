<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>연습문제</title>
</head>
<body>		
			
	<%-- 
	
		# 회원가입
		
		- 폼 전송 데이터를 formEx09Pro_정답.jsp에서 출력해보시오. 
	
	--%>			
	
	<form method="post" action="formEx09Pro.jsp">
		<fieldset>
			<legend>회원가입 폼</legend>
			<p>아이디 :   <input type="text" name="id"/></p>
			<p>비밀번호 : <input type="password" name="password"/></p>
			<p>이름 :     <input type="text" name="name"/></p>
			<p>나이 :     <input type="text" name="age"/></p>
			<p>
				성별 : <input type="radio" value="m" name="gender"/>남자
			   		   <input type="radio" value="f" name="gender"/>여자
			</p>
			<p>
				취미 : <input type="checkbox" value="운동" name="hobby"/>운동
					   <input type="checkbox" value="잠자기" name="hobby"/>잠자기
					   <input type="checkbox" value="공부하기" name="hobby"/>공부하기
			</p>
			<p>
				가고 싶은 여행지는
				<select>
					<option name="travel" >괌</option>
					<option name="travel" value="다낭">다낭</option>
					<option name="travel" value="나트랑">나트랑</option>
					<option name="travel" value="코타키나발루">코타키나발루</option>
					<option name="travel" value="대만">대만</option>
					<option name="travel" value="푸꾸옥">푸꾸옥</option>
				</select>
			</p>
			<p>
				메모<br/>
				<textarea rows="10" cols="50" name="memo" ></textarea>
			</p>
			<p>
				<input type="submit" value="회원가입"/>
				<input type="reset" value="다시쓰기"/>
			</p>
		</fieldset>
	</form>
	
</body>
</html>
</body>
</html>