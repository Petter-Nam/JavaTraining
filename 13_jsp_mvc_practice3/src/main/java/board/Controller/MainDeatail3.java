package board.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.DAO.BoardDAO3;
import board.DTO.BoardDTO3;

@WebServlet("/bDetail3")
public class MainDeatail3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//주는건 받자 (boardId)
		long boardId = Long.parseLong(request.getParameter("boardId"));
		
		// DB로 보내서 게시글 검색해오기
		BoardDTO3 boardDTO = BoardDAO3.getInstance().getBoardDetail(boardId); 
		
		// bDetail.jsp로 데이터 보내기
		request.setAttribute("boardDTO", boardDTO);
		
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx/bDetail3.jsp");
		dis.forward(request, response);
	}
}
