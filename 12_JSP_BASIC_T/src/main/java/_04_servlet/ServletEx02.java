package _04_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletEx02")
public class ServletEx02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("data1", "글자데이터");
		request.setAttribute("data2", 3);
		request.setAttribute("data3", 3.14);
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter04_servlet/servletEx02.jsp"); // webapp 디렉터리 하위 경로부터 기술한다.
		dis.forward(request, response);
		
	}

}
