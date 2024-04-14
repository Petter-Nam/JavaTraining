package _04_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ser")
public class ServletEx01_연습1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter04_servlet/servletEx01_연습.jsp");
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");
		
		System.out.println("data1 : " + request.getParameter("data1"));
		System.out.println("data2 : " + request.getParameter("data2"));
		System.out.println("data3 : " + request.getParameter("data3"));
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter04_servlet/servletEx01Action.jsp");
		dis.forward(request, response);
	}

}
