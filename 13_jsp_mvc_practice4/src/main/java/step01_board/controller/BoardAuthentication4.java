package step01_board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import step01_board.dao.BoardDAO4;
import step01_board.dto.BoardDTO4;

@WebServlet("/bAuthentication4")
public class BoardAuthentication4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//인증화면 달라
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 수정 삭제버튼을 눌렀을 때 인증화면으로 이동시키는 메서드
		 * 
		 */
		
		long boardId = Long.parseLong(request.getParameter("boardId"));
		BoardDTO4 boardDTO = BoardDAO4.getInstance().getBoardDetail(boardId);
		
		request.setAttribute("boardDTO", boardDTO);
		request.setAttribute("menu", request.getParameter("menu"));
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx/bAuthentication4.jsp");
		dis.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String menu = request.getParameter("menu");
		
		BoardDTO4 boardDTO = new BoardDTO4();
		long boardId = Long.parseLong(request.getParameter("boardId"));
		boardDTO.setBoardId(boardId);
		boardDTO.setPassword(request.getParameter("password"));
		
		boolean isAuthenticationUser = BoardDAO4.getInstance().checkAuthenticationUser(boardDTO);
		
		String jsScript = "";
		
		if (isAuthenticationUser) {
			if (menu.equals("update")) {
				jsScript = "<script>";
				jsScript += "location.href='bUpdate4?boardId=" + boardId + "';";
				jsScript += "</script>";
			}
		}
		else if (menu.equals("delete")) {
			jsScript = "<script>";
			jsScript += "location.href='bDelete4?boardId=" + boardId + "';";
			jsScript += "</script>";
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
