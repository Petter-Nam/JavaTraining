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

/**
 * Servlet implementation class BoardDelete4
 */
@WebServlet("/bDelete4")
public class BoardDelete4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("boardId", request.getParameter("boardId"));
		
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx/bDelete4.jsp");
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long boardId = Long.parseLong(request.getParameter("boardId"));
		
		BoardDAO4.getInstance().deleteBoard(boardId);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String jsScript = """
				<script>
					alert('게시글이 삭제되었습니다.');
					location.href = 'bList4';
				</script>
				"""; // location.href = 'url' > 해당url로 이동하는 자바스크립트 함수
		
		out.print(jsScript);
	}

}
