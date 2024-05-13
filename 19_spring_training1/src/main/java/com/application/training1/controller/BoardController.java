package com.application.training1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.training1.dto.BoardDTO;
import com.application.training1.service.BoardService;



@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/createBoard") //createBoard.html에서 submit진행시 아래의 메서드로 매핑된다.
	public String createBoard() {// localhost/board/createBoard로 요청시 아래의 메서드로 매핑
		return "board/createBoard";// templates/board/createBoard.html로 이동
	}
	
	@PostMapping("/createBoard")
	@ResponseBody
	public String createBoard(@ModelAttribute BoardDTO boardDTO) {
		System.out.println("게시글 작성 "+boardDTO);
		boardService.createBoard(boardDTO); //createBoard.html에서 전달받은 데이터를 Service객체로 전달한
		
		String jsScript = """
				<script>
					alert('게시글이 작성되었습니다.');
					location.href = '/board/boardList';
				</script>	
					""";
		return jsScript;
	}
	
	@GetMapping("boardList") // localhost/board/boardList로 요청시 아래의 메서드 매핑
	public String boardList(Model model) {
		
		for(BoardDTO board : boardService.getBoardList()) {
			System.out.println("board" + board);
		}
		
		model.addAttribute("boardList", boardService.getBoardList());
		
		return "board/boardList";
	}
	
	@GetMapping("boardDetail")
	public String boardDetail(Model model, @RequestParam("boardId") long boardId) {
		
		model.addAttribute("boardDTO", boardService.getBoardDetail(boardId, true));
		
		return "board/boardDetail";
	}
}
