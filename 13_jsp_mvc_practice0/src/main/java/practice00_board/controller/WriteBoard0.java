package practice00_board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice00_board.dao.BoardDAO0;
import practice00_board.dto.BoardDTO0;


@WebServlet("/bWriteBoard0")
public class WriteBoard0 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx00/bWrite0.jsp");
		dis.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		// 전송받은 데이터를 DTO형태로 만든다.
		BoardDTO0 boardDTO = new BoardDTO0();
		boardDTO.setWriter(request.getParameter("writer"));
		boardDTO.setSubject(request.getParameter("subject"));
		boardDTO.setEmail(request.getParameter("email"));
		boardDTO.setPassword(request.getParameter("password"));
		boardDTO.setContent(request.getParameter("content"));
		
		// 단위 테스트
		System.out.println("doPost : " + boardDTO);
		
		// DAO클래스로 DTO 데이터 전송
		// new BoardDAO0()
		BoardDAO0.getInstance().insertBoard(boardDTO);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String jsScript = """
				<script>
					alert('게시글이 등록되었습니다.');
					location.href = 'bList0';
				</script>
				""";
		out.print(jsScript);
	}

}
