package _04_AJAX;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajaxEx03")
public class AjaxEx03 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("04_jQuery/chapter04_AJAX/ajaxEx03.jsp");
		dis.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// PrintWriter 객체를 사용하여 AJAX 성공 콜백함수에 데이터를 반환한다.
		response.setContentType("text/html; charset=utf-8"); // 반환데이터의 한글화
		
		PrintWriter out = response.getWriter();
		// jsp에서는 string 타입만 반환 > spring에서 dto , map , list 학습
		out.print("비즈니스 로직을 처리한 반환데이터 입니다."); // ajax의 success: function(data){} 로 반환된다.
		
	}
	
	
}
