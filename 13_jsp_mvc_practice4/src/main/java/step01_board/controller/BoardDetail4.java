package step01_board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import step01_board.dao.BoardDAO4;
import step01_board.dto.BoardDTO4;

/**
 * Servlet implementation class BoardDetail4
 */
@WebServlet("/bDetail4")
public class BoardDetail4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long boardId = Long.parseLong(request.getParameter("boardId"));
		
		BoardDTO4 boardDTO = BoardDAO4.getInstance().getBoardDetail(boardId);
		
		request.setAttribute("boardDTO", boardDTO);
		
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx/bDetail4.jsp");
		dis.forward(request, response);	
	}
}
