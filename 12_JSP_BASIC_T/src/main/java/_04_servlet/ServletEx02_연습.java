package _04_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servleTrade")
public class ServletEx02_연습 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			request.setAttribute("data1", "글자데이터");
			request.setAttribute("data2", 3);
			request.setAttribute("data3", 3.14);
		
			RequestDispatcher dis = request.getRequestDispatcher("chapter04_servlet/servletEx02_trade1.jsp");
			dis.forward(request, response);
	}



}
