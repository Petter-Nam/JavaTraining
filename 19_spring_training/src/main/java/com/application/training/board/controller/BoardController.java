package com.application.training.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.training.board.dto.BoardDTO;
import com.application.training.board.service.BoardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService; // BoardServiceImpl 객체를 주입한다.
	
	@GetMapping("/createBoard") // localhost/board/createBoard로 요청시 아래의 메서드로 매핑된다.
	public String createBoard() {
		return "board/createBoard"; // templates/board/createBoard.html로 이동
	}
	
	@PostMapping("/createBoard")
	@ResponseBody
	public String createBoard(@ModelAttribute BoardDTO boardDTO) {// createBoard.html에서 submit진행시 아래의 메서드로 매핑된다.
																  // <form>태그의 데이터를 BoardDTO타입으로 전달받는다.
		//단위테스트
		//System.out.println(boardDTO);
		
		boardService.createBoard(boardDTO);
		
		String jsScript ="""
				<script>
					alert('게시글이 작성되었습니다.');
					location.href='/board/boardList';
				</script>
				""";
		
		return jsScript;
	}
	
	@GetMapping("/boardList")
	public String boardList(Model model) {
		
		for (BoardDTO boardDTO : boardService.getBoardList()) {
			System.out.println(boardDTO);
		}
		
		model.addAttribute("boardList", boardService.getBoardList());
		return "board/boardList";
	}
	
	@GetMapping("/boardDetail")
	public String boardDetail(Model model, @RequestParam("boardId") long boardId) {
		
		
		model.addAttribute("boardDTO", boardService.getBoardDetail(boardId, true));
		
		return "board/boardDetail";
	}
	
}
