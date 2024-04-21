package step01_board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import step01_board.dao.BoardDAO;
import step01_board.dto.BoardDTO;


@WebServlet("/bWrite")
public class WriteBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("step01_board_practiceEx1/bWrite.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		
		// 전송받은 데이터를 DTO형태로 만든다.
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setWriter(request.getParameter("writer"));
		boardDTO.setWriter(request.getParameter("subject"));
		boardDTO.setWriter(request.getParameter("email"));
		boardDTO.setWriter(request.getParameter("password"));
		boardDTO.setWriter(request.getParameter("content"));
		
		// 단위 테스트
		System.out.println("doPost : " + boardDTO);
		
		// DAO클래스로 DTO데이터 전송
		// new BoardDAO();
		BoardDAO.getInstance().insertBoard(boardDTO);
		
	}

}
