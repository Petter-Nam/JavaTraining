<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>그저 연습이다.</title>
</head>
<body>
	<h3>데이터전송</h3>
	<form method="post" action="ser">
		<table border="1">
				<tr>
					<th>데이터1</th>
					<td><input type="text" name="data1"></td>
				</tr>
				<tr>
					<th>데이터2</th>
					<td><input type="text" name="data2"></td>
				</tr>
				<tr>
					<th>데이터3</th>
					<td><input type="text" name="data3"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="전송">
					</td>
				</tr>
		</table>
	</form>
</body>
</html>