package practice02_board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice02_board.dao.BoardDAO2;
import practice02_dto.BoardDTO2;


@WebServlet("/bWrite2")
public class BoardWirter2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx02/bWrite2.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//전송받은 데이터를 DTO형태로 만든다.
		BoardDTO2 boardDTO2 = new BoardDTO2();
		boardDTO2.setWriter(request.getParameter("writer"));
		boardDTO2.setSubject(request.getParameter("subject"));
		boardDTO2.setEmail(request.getParameter("email"));
		boardDTO2.setPassword(request.getParameter("password"));
		boardDTO2.setContent(request.getParameter("content"));
		
		// 단위 테스트 
		System.out.println("doPost : " + boardDTO2);
		
		//DAO 클래스로 DTO데이터 전송
		// new BoardDTO2();
		BoardDAO2.getInstance().insertBoard(boardDTO2);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String jsScript = """
				<script>
					alert('게시글이 등록되었습니다.);
					location.href = 'bList';
					</scipt>
				""";
		out.print(jsScript);
	}

}
