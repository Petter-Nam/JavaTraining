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

@WebServlet("/bUpdate6")
public class BoardUpdate6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long boardId = Long.parseLong(request.getParameter("boardId"));
		
		BoardDTO6 boardDTO = BoardDAO6.getInstance().getBoardDetail(boardId);
		request.setAttribute("boardDTO", boardDTO);
		
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx/bUpdate6.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		BoardDTO6 boardDTO = new BoardDTO6();
		boardDTO.setBoardId(Long.parseLong(request.getParameter("boardId")));
		boardDTO.setSubject(request.getParameter("subject"));
		boardDTO.setContent(request.getParameter("content"));
		
		BoardDAO6.getInstance().updateBoard(boardDTO);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String jsScript = """
				<script>
					alert('게시글이 수정되었습니다.');
					location.href = 'bList6';
				</script>
				"""; // location.href = 'url' > 해당url로 이동하는 자바스크립트 함수
		
		out.print(jsScript);
	}

}
