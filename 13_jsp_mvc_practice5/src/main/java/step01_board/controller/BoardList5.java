package step01_board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import step01_board.dao.BoardDAO5;
import step01_board.dto.BoardDTO5;

@WebServlet("/bList5")
public class BoardList5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<BoardDTO5> boardList = BoardDAO5.getInstance().getBoardList();
		
		request.setAttribute("boardList", boardList);
		
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx/bList5.jsp");
		dis.forward(request, response);
	}
}
