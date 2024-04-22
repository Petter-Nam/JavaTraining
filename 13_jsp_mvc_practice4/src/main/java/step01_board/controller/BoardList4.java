package step01_board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import step01_board.dao.BoardDAO4;
import step01_board.dto.BoardDTO4;

@WebServlet("/bList4")
public class BoardList4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<BoardDTO4> boardList = BoardDAO4.getInstance().getBoardList();
		
		request.setAttribute("boardList", boardList);
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx/bList4.jsp");
		dis.forward(request, response);	
	}
	
	

}
