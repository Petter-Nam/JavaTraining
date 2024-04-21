package practice02_board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice02_board.dao.BoardDAO2;
import practice02_dto.BoardDTO2;



@WebServlet("/bList2")
public class BoardList2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//new BoardDAO();
		ArrayList<BoardDTO2> boardList = BoardDAO2.getInstance().getBoardList();
		
		request.setAttribute("boardList" , boardList);
		
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx02/bList2.jsp");
		dis.forward(request, response);	
		
	}

}
