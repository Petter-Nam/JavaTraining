package practice00_board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice00_board.dao.BoardDAO0;
import practice00_board.dto.BoardDTO0;


@WebServlet("/bList0")
public class ListBoard0 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// new BoardDAO0();
		
		ArrayList<BoardDTO0> boardList = BoardDAO0.getInstance().getBoardList();
		
		request.setAttribute("boardList", boardList);
		
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx00/bList0.jsp");
		dis.forward(request, response);
	}

}
