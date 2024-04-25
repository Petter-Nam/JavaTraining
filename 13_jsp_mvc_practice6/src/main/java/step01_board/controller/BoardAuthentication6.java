package step01_board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import step01_board.dao.BoardDAO6;
import step01_board.dto.BoardDTO6;


@WebServlet("/bAuthentication6")
public class BoardAuthentication6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		long boardId = Long.parseLong(request.getParameter("boardId"));
		BoardDTO6 boardDTO = BoardDAO6.getInstance().getBoardDetail(boardId);
		
		request.setAttribute("boardDTO", boardDTO);
		request.setAttribute("menu", request.getParameter("menu"));
		
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx/bAuthentication6.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String menu = request.getParameter("menu");
		
		BoardDTO6 boardDTO = new BoardDTO6();
		long boardId = Long.parseLong(request.getParameter("boardId"));
		boardDTO.setBoardId(boardId);
		boardDTO.setPassword(request.getParameter("password"));
		
		boolean isAuthenticationUser = BoardDAO6.getInstance().checkAuthenticationUser(boardDTO);
		
		String jsScript = "";
		
		if (isAuthenticationUser) {
			
			if (menu.equals("update")) {
				jsScript = "<script>";
				jsScript += "location.href='bUpdate6?boardId=" + boardId + "';";
				jsScript += "</script>";
			}
			else if (menu.equals("delete")) {
				jsScript = "<script>";
				jsScript += "location.href='bDelete6?boardId=" + boardId + "';";
				jsScript += "</script>";
			}
		}
		else {
			jsScript = "<script>";
			jsScript += "alert('패스워드를 확인하세요.');";
			jsScript += "history.go(-1);";
			jsScript += "</script>";
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(jsScript);
	}

}
